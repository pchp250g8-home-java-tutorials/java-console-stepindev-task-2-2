/*
 * Нажмите nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
   для изменения условий этой лицензии
 */
package com.home.task_2_2_ru;
import java.io.*;
/**
 *
 * @author PC
 */
public class Program 
{
    public static void main(String[] args) throws Exception
    {
        int prev; // первая высота
        int curr; // вторая высота
        int peaks_count = 0;  // счётчик пиков
        boolean b_done = false;  // флаг окончания цикла
        var stdin=new BufferedReader(new InputStreamReader(System.in));
        // Вывод подсказки на экран
        System.out.println("Введите данные радарной станции (0 - конец ввода).");
        // Считываем первые два элемента
        prev = Integer.parseUnsignedInt(stdin.readLine()); // ввод первой высоты
        curr = Integer.parseUnsignedInt(stdin.readLine()); // ввод второй высоты
        while (!b_done) // Цикл ввода и анализа данных.
        {
            // Ввод третьей высоты.
            // Если встретили 0, ввод окончен
            int next_val;
            next_val = Integer.parseUnsignedInt(stdin.readLine());
            b_done = (next_val == 0);  // условие окончания цикла
            // Проверяем условие пика для текущего элемента
            if (!b_done && curr > prev && curr > next_val)
            {
                peaks_count += 1; // счётчик пиков увеличили на 1
            }
            // Сдвигаем «окно» из трёх элементов вперед
            prev = curr;
            curr = next_val;
        }
        // Вывод на экран
        System.out.println("Количество пиков: " + peaks_count);
    }
}
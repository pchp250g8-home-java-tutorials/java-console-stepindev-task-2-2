/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 */
package com.home.task_2_2_en;
import java.io.*;
/**
 *
 * @author PC
 */
public class Program 
{
    public static void main(String[] args) throws Exception
    {
        int prev; // first height
        int curr; // second height
        int peaks_count = 0; // peak counter
        boolean b_done = false; // loop termination flag
        var stdin = new BufferedReader(new InputStreamReader(System.in)); 
        // Display prompt
        System.out.println("Enter radar station data (0 to end input)."); 
        // Read the first two elements
        prev = Integer.parseUnsignedInt(stdin.readLine()); // input first height
        curr = Integer.parseUnsignedInt(stdin.readLine()); // input second height
        while (!b_done) // Data input and analysis loop
        {
            // Input third height. 
            // If 0 is encountered, input ends
            int next_val; 
            next_val = Integer.parseUnsignedInt(stdin.readLine()); 
            b_done = (next_val == 0); // loop termination condition
            // Check peak condition for the current element
            if (!b_done && curr > prev && curr > next_val)
            {
                peaks_count += 1; // increment peak counter
            }
            // Shift the three-element "window" forward
            prev = curr; 
            curr = next_val; 
        }
        // Display output
        System.out.println("Number of peaks: " + peaks_count);
    }
}

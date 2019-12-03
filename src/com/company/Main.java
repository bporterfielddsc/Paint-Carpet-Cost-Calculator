package com.company;

import javax.swing.*;

public class Main {
    private static double roomLength;
    private static double roomHeight;
    private static double roomWidth;
    private static double doorHeight;
    private static double doorWidth;
    private static double window1Height;
    private static double window1Width;
    private static double window2Height;
    private static double window2Width;
    private static double shelfWidth;
    private static double shelfHeight;
    private static double shelfDepth;
    private static double paintCost;
    private static double carpetCost;

    public static void main(String[] args)
    {
        Method2();
    }
    public static void Method2()
    {
       roomLength = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the length of the room that is to be painted"));
       roomHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the height of the room that is to be painted"));
        roomWidth = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the width of the room that is to be painted"));

        Method3();
    }
    public static void Method3()
    {
        window1Width = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the width in feet of window 1"));
        window1Height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the height in feet of window 1"));
        window2Width = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the width in feet of window 2"));
        window2Height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the height in feet of window 2"));
        doorWidth = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the width in feet of the door"));
        doorHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the height in feet of the door"));

        Method4();

    }
    public static void Method4()
    {
        shelfWidth = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the width in feet of the bookshelf"));
        shelfHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the height in feet of the bookshelf"));
        shelfDepth = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the depth in feet of the bookshelf"));

        Method5();
    }
    public static void Method5()
    {
        paintCost = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the cost per square foot to paint the walls"));
        carpetCost = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the cost per square foot to install the carpet"));

        Method6();

    }
    public static void Method6()
    {
        double totalPaintCost = 0;
        double totalCarpetCost = 0;
        double totalCost = 0;
        double window1Area = 0;
        double window2Area = 0;
        double doorArea = 0;

        window1Area = window1Height*window1Width;
        window2Area = window2Height*window2Width;
        doorArea = doorHeight*doorWidth;

        totalPaintCost = ((2*(roomWidth*roomHeight)+(2*(roomLength*roomHeight)))-(window1Area + window2Area + doorArea))*paintCost;

        totalCarpetCost = ((roomWidth*roomLength)-(shelfWidth*shelfDepth))*carpetCost;

        totalCost = totalPaintCost +totalCarpetCost;

        JOptionPane.showMessageDialog(null, "The total cost to paint the room is " + totalPaintCost);
        JOptionPane.showMessageDialog(null, "The total cost to carpet the room is " + totalCarpetCost);
        JOptionPane.showMessageDialog(null, "The total cost to make your room absolutely fab with new paint and carpet is " + totalCost);

    }
}

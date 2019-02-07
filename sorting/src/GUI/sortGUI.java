/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Random;

/**
 * Programmer: Ethan Cook Date: October 24th, Program Name: Sorting Program
 * Description: Compares the different sorting methods Side note: Add a non
 * negative num, Maybe turn the random function into a method?
 */
public class sortGUI extends javax.swing.JFrame {

    Random rand = new Random(); //For our random number generation
    boolean invalidInput = false; //Check boolean

    /**
     * Creates new form sortGUI
     */
    public sortGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ranGen = new javax.swing.ButtonGroup();
        sortOrder = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        randomGenLabel = new javax.swing.JLabel();
        sortOrderLabel = new javax.swing.JLabel();
        orginalOrderLabel = new javax.swing.JLabel();
        sortedOrderLabel = new javax.swing.JLabel();
        ranGen10 = new javax.swing.JRadioButton();
        ranGen100 = new javax.swing.JRadioButton();
        ranGen1000 = new javax.swing.JRadioButton();
        ranGen5000 = new javax.swing.JRadioButton();
        ascendingOrder = new javax.swing.JRadioButton();
        descendingOrder = new javax.swing.JRadioButton();
        scrollPane = new javax.swing.JScrollPane();
        orginalOrderOut = new javax.swing.JTextArea();
        scrollPane2 = new javax.swing.JScrollPane();
        sortedOrderOut = new javax.swing.JTextArea();
        scrollPane3 = new javax.swing.JScrollPane();
        displayOut = new javax.swing.JTextArea();
        iconLabel = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        exitTrigger = new javax.swing.JMenu();

        ranGen.add(ranGen10);
        ranGen.add(ranGen100);
        ranGen.add(ranGen1000);
        ranGen.add(ranGen5000);

        sortOrder.add(ascendingOrder);
        sortOrder.add(descendingOrder);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 0, 102));
        titleLabel.setText("Sorting Efficiencies");

        randomGenLabel.setText("Please Enter The Amount Of Numbers To Generate And Add:");

        sortOrderLabel.setText("Sort Order:");

        orginalOrderLabel.setText("Orginal Order:");

        sortedOrderLabel.setText("Sorted Order:");

        ranGen10.setText("10");

        ranGen100.setText("100");

        ranGen1000.setText("1000");

        ranGen5000.setText("5000");

        ascendingOrder.setText("Ascending");

        descendingOrder.setText("Descending");

        orginalOrderOut.setEditable(false);
        orginalOrderOut.setColumns(20);
        orginalOrderOut.setRows(5);
        scrollPane.setViewportView(orginalOrderOut);

        sortedOrderOut.setEditable(false);
        sortedOrderOut.setColumns(20);
        sortedOrderOut.setRows(5);
        scrollPane2.setViewportView(sortedOrderOut);

        displayOut.setEditable(false);
        displayOut.setColumns(20);
        displayOut.setRows(5);
        scrollPane3.setViewportView(displayOut);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Fey.jpg"))); // NOI18N

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        exitTrigger.setText("Exit");
        exitTrigger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTriggerMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitTrigger);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orginalOrderLabel)
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(randomGenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ranGen10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ranGen100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ranGen1000)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ranGen5000))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(sortOrderLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(sortedOrderLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ascendingOrder)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(descendingOrder)
                                                .addGap(18, 18, 18)
                                                .addComponent(sortButton)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(randomGenLabel)
                            .addComponent(ranGen10)
                            .addComponent(ranGen100)
                            .addComponent(ranGen1000)
                            .addComponent(ranGen5000))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortOrderLabel)
                            .addComponent(ascendingOrder)
                            .addComponent(descendingOrder)
                            .addComponent(sortButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orginalOrderLabel)
                            .addComponent(sortedOrderLabel)))
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane2)
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void selectionSort(int[] A, int sortOrder) {
        //Variable Declaration
        long start, finish, elapsed;
        int temp, itemCount, loopCount, shiftCount, compCount;
        loopCount = 0;
        shiftCount = 0;
        compCount = 0;
        itemCount = A.length;

        start = System.currentTimeMillis(); //Save time when the search started
        for (int i = 0; i < itemCount; i++) {
            //Counters
            compCount++;
            loopCount++;
            switch (sortOrder) {
                case 1:
                    for (int j = i + 1; j < itemCount; j++) {
                        //Counters
                        loopCount++;
                        compCount++;
                        if (A[i] > A[j]) {
                            temp = A[i];
                            A[i] = A[j];
                            A[j] = temp;
                            compCount++;
                            shiftCount = shiftCount + 2;
                        }
                    }
                    break;
                case 2:
                    for (int j = i + 1; j < itemCount; j++) {
                        //Counters
                        loopCount++;
                        compCount++;
                        if (A[i] < A[j]) {
                            temp = A[j];
                            A[j] = A[i];
                            A[i] = temp;
                            compCount++;
                            shiftCount = shiftCount + 2;
                        }
                    }
                    break;
            }
        }
        //Finding Elapsed Time
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        //Output
        displayOut.append("|| SELECTION SORT ||\n");
        displayOut.append("Number Of Milliseconds It Took To Sort: " + elapsed + "\n");
        displayOut.append("Number Of Times The Loop Was Executed: " + loopCount + "\n");
        displayOut.append("Number Of Times A Comparsion Was Made: " + compCount + "\n");
        displayOut.append("Number Of Times A Value Was Shifted: " + shiftCount + "\n");
    }

    public void bubbleSort(int[] A, int sortOrder) {
        long start, finish, elapsed;
        boolean swap;
        int temp, itemCount, loopCount, shiftCount, compCount;
        loopCount = 0;
        shiftCount = 0;
        compCount = 0;
        itemCount = A.length;
        swap = true;
        start = System.currentTimeMillis();
        while (swap == true) {
            loopCount++;
            compCount++;
            swap = false;
            switch (sortOrder) {
                case 1:
                    for (int j = 0; j < itemCount - 1; j++) {
                        loopCount++;
                        compCount++;
                        if (A[j] > A[j + 1]) {
                            swap = true;
                            temp = A[j];
                            A[j] = A[j + 1];
                            A[j + 1] = temp;
                            compCount++;
                            shiftCount = shiftCount + 2;
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < itemCount - 1; j++) {
                        loopCount++;
                        compCount++;
                        if (A[j] < A[j + 1]) {
                            swap = true;
                            temp = A[j];
                            A[j] = A[j + 1];
                            A[j + 1] = temp;
                            compCount++;
                            shiftCount = shiftCount + 2;
                        }
                    }
                    break;
            }
        }
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        displayOut.append("|| BUBBLE SORT ||\n");
        displayOut.append("Number Of Milliseconds It Took To Sort: " + elapsed + "\n");
        displayOut.append("Number Of Times The Loop Was Executed: " + loopCount + "\n");
        displayOut.append("Number Of Times A Comparsion Was Made: " + compCount + "\n");
        displayOut.append("Number Of Times A Value Was Shifted: " + shiftCount + "\n");
    }

    public void insertSort(int[] A, int sortOrder) {
        long start, finish, elapsed;
        int temp, itemCount, loopCount, shiftCount, compCount;
        loopCount = 0;
        shiftCount = 0;
        compCount = 0;
        itemCount = A.length;
        start = System.currentTimeMillis();

        switch (sortOrder) {
            case 1:
                invalidInput = false;
                for (int j = 1; j < itemCount; j++) {
                    compCount++;
                    loopCount++;
                    temp = A[j];
                    int i = j - 1;
                    while (i >= 0 && A[i] > temp) {
                        compCount = compCount + 2;
                        loopCount++;
                        shiftCount++;
                        A[i + 1] = A[i];
                        i = i - 1;
                    }
                    A[i + 1] = temp;
                    shiftCount++;
                }
                break;
            case 2:
                invalidInput = false;
                for (int j = 1; j < itemCount; j++) {
                    compCount++;
                    loopCount++;
                    temp = A[j];
                    int i = j - 1;
                    while (i >= 0 && A[i] < temp) {
                        compCount = compCount + 2;
                        loopCount++;
                        shiftCount++;
                        A[i + 1] = A[i];
                        i = i - 1;
                    }
                    A[i + 1] = temp;
                    shiftCount++;
                }
                break;
            case 0:
                invalidInput = true;
                break;
        }
        if (invalidInput == false) {
            finish = System.currentTimeMillis();
            elapsed = finish - start;
            displayOut.append("|| INSERT SORT ||\n");
            displayOut.append("Number Of Milliseconds It Took To Sort: " + elapsed + "\n");
            displayOut.append("Number Of Times The Loop Was Executed: " + loopCount + "\n");
            displayOut.append("Number Of Times A Comparsion Was Made: " + compCount + "\n");
            displayOut.append("Number Of Times A Value Was Shifted: " + shiftCount + "\n");
        } else {
            displayOut.setText("You have not chosen a sort order");
            orginalOrderOut.setText("");
            sortedOrderOut.setText("");
        }
    }

    private void exitTriggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTriggerMouseClicked
        //Exit
        System.exit(0);
    }//GEN-LAST:event_exitTriggerMouseClicked

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO: Generate random numbers based on radio button input
        orginalOrderOut.setText("");
        sortedOrderOut.setText("");
        displayOut.setText("");

        int[] randNum = new int[0];
        if (ranGen10.isSelected() == true) {
            randNum = new int[10];
            for (int i = 0; i < 10; i++) {
                randNum[i] = rand.nextInt();
            }
        } else if (ranGen100.isSelected() == true) {
            randNum = new int[100];
            for (int i = 0; i < 100; i++) {
                randNum[i] = rand.nextInt();
            }
        } else if (ranGen1000.isSelected() == true) {
            randNum = new int[1000];
            for (int i = 0; i < 1000; i++) {
                randNum[i] = rand.nextInt();
            }
        } else if (ranGen5000.isSelected() == true) {
            randNum = new int[5000];
            for (int i = 0; i < 5000; i++) {
                randNum[i] = rand.nextInt();
            }
        } else {
            displayOut.setText("You Have Not Selected The Amount Of Numbers To Be Created");
        }

        int sortOrderCheck; //0 is no input 1 is ascending 2 is descendin   
        int temp;
        if (ascendingOrder.isSelected() == true) {
            sortOrderCheck = 1;
        } else if (descendingOrder.isSelected() == true) {
            sortOrderCheck = 2;
        } else {
            sortOrderCheck = 0;
        }

        //Below we are just using this to implement and test each sort method this will be changed because its redudent as fuck to create a new array for each one and sort them all.
        int[] selectionSorted = new int[randNum.length];
        int[] bubbleSorted = new int[randNum.length];
        int[] insertSorted = new int[randNum.length];

        System.arraycopy(randNum, 0, selectionSorted, 0, randNum.length);
        System.arraycopy(randNum, 0, bubbleSorted, 0, randNum.length);
        System.arraycopy(randNum, 0, insertSorted, 0, randNum.length);

        selectionSort(selectionSorted, sortOrderCheck); //works leave it alone unless fixing the jank addding the tracking assingment stuff
        bubbleSort(bubbleSorted, sortOrderCheck); //works leave it alone unless fixing the JANK or addign the assingment stuff        
        insertSort(insertSorted, sortOrderCheck); //works leave it alone unless fixing the JANK or addign the assingment stuff 

//Display my man || Below I was usign this to display the sorted order this wont work for the assignment requirements it was just to implment the 3 sort functions which is now done
        for (int i = 0; i < randNum.length; i++) {
            if (invalidInput == false) {
                orginalOrderOut.append(randNum[i] + "\n");
                sortedOrderOut.append(bubbleSorted[i] + "\n");
            } else {
                displayOut.setText("You have not chosen a sort order");
                orginalOrderOut.setText("");
                sortedOrderOut.setText("");
            }
        }


    }//GEN-LAST:event_sortButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sortGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sortGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sortGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sortGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sortGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascendingOrder;
    private javax.swing.JRadioButton descendingOrder;
    private javax.swing.JTextArea displayOut;
    private javax.swing.JMenu exitTrigger;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel orginalOrderLabel;
    private javax.swing.JTextArea orginalOrderOut;
    private javax.swing.ButtonGroup ranGen;
    private javax.swing.JRadioButton ranGen10;
    private javax.swing.JRadioButton ranGen100;
    private javax.swing.JRadioButton ranGen1000;
    private javax.swing.JRadioButton ranGen5000;
    private javax.swing.JLabel randomGenLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JScrollPane scrollPane3;
    private javax.swing.JButton sortButton;
    private javax.swing.ButtonGroup sortOrder;
    private javax.swing.JLabel sortOrderLabel;
    private javax.swing.JLabel sortedOrderLabel;
    private javax.swing.JTextArea sortedOrderOut;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
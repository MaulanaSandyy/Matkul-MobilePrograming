package belajarGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Input Nilai Mahasiswa");
        frame.setSize(700, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNim = new JLabel("NIM: ");
        lblNim.setBounds(20, 20, 80, 25);
        frame.add(lblNim);

        JTextField tfNim = new JTextField();
        tfNim.setBounds(120, 20, 200, 25);
        frame.add(tfNim);

        JLabel lblNama = new JLabel("Nama: ");
        lblNama.setBounds(20, 50, 80, 25);
        frame.add(lblNama);

        JTextField tfNama = new JTextField();
        tfNama.setBounds(120, 50, 200, 25);
        frame.add(tfNama);

        JLabel lblUts = new JLabel("Nilai UTS: ");
        lblUts.setBounds(20, 80, 80, 25);
        frame.add(lblUts);

        JTextField tfUts = new JTextField();
        tfUts.setBounds(120, 80, 200, 25);
        frame.add(tfUts);

        JLabel lblUas = new JLabel("Nilai UAS: ");
        lblUas.setBounds(20, 110, 80, 25);
        frame.add(lblUas);

        JTextField tfUas = new JTextField();
        tfUas.setBounds(120, 110, 200, 25);
        frame.add(tfUas);

        JButton btnCalculate = new JButton("Hitung");
        btnCalculate.setBounds(120, 140, 100, 30);
        frame.add(btnCalculate);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(50, 180, 600, 80);
        resultArea.setEditable(false);
        frame.add(resultArea);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nim = tfNim.getText();
                    String nama = tfNama.getText();
                    double uts = Double.parseDouble(tfUts.getText());
                    double uas = Double.parseDouble(tfUas.getText());
                    double rata = (uts + uas) / 2;

                    String grade;
                    if (rata < 50) grade = "E";
                    else if (rata < 60) grade = "D";
                    else if (rata < 70) grade = "C";
                    else if (rata < 80) grade = "B";
                    else grade = "A";

                    resultArea.setText("====================================================================================\n" 
                            + "NIM\t\tNama\t\tUTS\tUAS\tRata\tGrade\n" + "====================================================================================\n" 
                            + nim + "\t" + nama + "\t" + uts + "\t" + uas + "\t" + rata + "\t    " + grade + "\n");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for UTS and UAS", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}  

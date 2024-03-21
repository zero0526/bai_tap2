///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.calculator;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
///**
// *
// * @author Admin
// */
//public class interf {
//    public static void main(String[] args) {
//        JFrame jf=new JFrame("Calculator");
//        JLabel first=new JLabel("first number   :"); 
//        JLabel second=new JLabel("Second number:");
//        JLabel rs=new JLabel("result    :");
//        JTextField tf1=new JTextField();
//        JTextField tf2=new JTextField();
//        JTextField tf3=new JTextField();
//        JButton clear=new JButton("clear");
//        JButton add=new JButton("add");
//        JButton sub=new JButton("sub");
//        JButton mul=new JButton("mul");
//        JButton div=new JButton("div");
//        first.setBounds(100,100,100,30);
//        second.setBounds(100,140,100,30);
//        rs.setBounds(100,180,100,30);
//        tf1.setBounds(200,105,150,25);
//        tf2.setBounds(200,145,150,25);
//        tf3.setBounds(200,185,150,25);
//        clear.setBounds(200,230,70,30);
//        add.setBounds(200,270,60,30);
//        sub.setBounds(200,315,60,30);
//        mul.setBounds(275,270,60,30);
//        div.setBounds(275,315,6,30);
//        clear.addActionListener0(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                tf1.setText("");
//                tf2.setText("");
//                tf3.setText("");
//            }
//        });
//        add.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                String a=tf1.getText();
//                String b=tf2.getText();
//                tf3.setText(String.format("%4d",Integer.parseInt(a)+Integer.parseInt(b)));
//            }
//        });
//        sub.addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent e){
//                    String a=tf1.getText();
//                    String b=tf2.getText();
//                    tf3.setText(String.format("%4d",Integer.parseInt(a)-Integer.parseInt(b)));
//                }
//        });
//        mul.addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent e){
//                    String a=tf1.getText();
//                    String b=tf2.getText();
//                    tf3.setText(String.format("%4d",Integer.parseInt(a)*Integer.parseInt(b)));
//                }
//        });
//        div.addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent e){
//                    String a=tf1.getText();
//                    String b=tf2.getText();
//                    tf3.setText(String.format("%4d",Integer.parseInt(a)/Integer.parseInt(b)));
//                }
//        });
//        jf.add(first);
//        jf.add(second);
//        jf.add(rs);
//        jf.add(tf1);
//        jf.add(tf2);
//        jf.add(tf3);
//        jf.add(clear);
//        jf.add(add);
//        jf.add(sub);
//        jf.add(mul);
//        jf.add(div);
//        jf.setSize(400,600);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setLocationRelativeTo(null);
//        jf.setLayout(null);
//        jf.setVisible(true);
//    }
//}   
//

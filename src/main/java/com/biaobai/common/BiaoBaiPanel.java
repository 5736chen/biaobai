package com.biaobai.common;

import javax.swing.*;
import java.awt.*;

public class BiaoBaiPanel extends JLayeredPane {
    public JLabel label1;
    public String text = "做我女朋友好吗？bro";

    public BiaoBaiPanel() {
        this.label1 = new JLabel();
        label1.setText(text);
        int label1FontSize = 10;
        int label1Width = label1FontSize*text.length()+10;
        int label1Height = label1FontSize+10;
        int label1X = 250 - label1Width/2;
        int label1Y = 250 - label1Height;
        label1.setFont(new Font("微软雅黑", Font.BOLD, label1FontSize));
        label1.setBounds(label1X, label1Y, label1Width, label1Height);
        add(label1, JLabel.CENTER);
    }
}

package com.biaobai.common;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BiaoBaiDialog extends JDialog {
    public BiaoBaiDialog() {
        setVisible(true);
        setBounds(50,100,300,300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel jLabel = new JLabel("现在你有一个好老公拉~ ╭(●｀∀´●)╯♥ ( ˘ ³˘)");
        jLabel.setBounds(10,10,290,100);
        container.add(jLabel);

        BiaoBaiButton sure = new BiaoBaiButton("哈哈哈，好的", 75, 150, 150, 30);
        sure.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        container.add(sure);
    }
}

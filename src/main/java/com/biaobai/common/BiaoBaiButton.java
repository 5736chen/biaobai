package com.biaobai.common;

import javax.swing.*;

public class BiaoBaiButton extends JButton {
    public BiaoBaiButton(String text, int x, int y, int width, int height) {
        setText(text);
        setBounds(x, y, width, height);
    }
}

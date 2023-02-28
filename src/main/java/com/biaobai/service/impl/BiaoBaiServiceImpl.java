package com.biaobai.service.impl;

import com.biaobai.common.BiaoBaiButton;
import com.biaobai.common.BiaoBaiDialog;
import com.biaobai.common.BiaoBaiPanel;
import com.biaobai.service.BiaoBaiService;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

@Service
public class BiaoBaiServiceImpl implements BiaoBaiService {

    static BiaoBaiPanel biaoBaiPanel = new BiaoBaiPanel();
    static JFrame jFrame = new JFrame();

    @Override
    public void biaoBai() {
        // 初始化窗体
        init();
        // 初始化窗体内容
        initContent();
        // 添加按钮
        addButton();
    }

    private static void addButton() {
        BiaoBaiButton sure = new BiaoBaiButton("我爱你", 100, 400, 80, 30);
        BiaoBaiButton cancel = new BiaoBaiButton("我不爱你", 350, 400, 100, 30);
        biaoBaiPanel.add(sure);
        biaoBaiPanel.add(cancel);
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int cancelX = new Random().nextInt(300) + 100;
                int cancelY = new Random().nextInt(300) + 100;
                cancel.setBounds(cancelX, cancelY, 100, 30);
                int label1FontSize = biaoBaiPanel.label1.getFont().getSize() + 3;
                int label1Width = label1FontSize*biaoBaiPanel.text.length()+10;
                int label1Height = label1FontSize+10;
                int label1X = 250 - label1Width/2;
                int label1Y = 250 - label1Height;
                biaoBaiPanel.label1.setFont(new Font("微软雅黑", Font.BOLD, label1FontSize));
                biaoBaiPanel.label1.setBounds(label1X, label1Y, label1Width, label1Height);
                jFrame.repaint();
            }
        });
        sure.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (sure.getText().equals("叫我一声男票我就走啦！")) {
                    jFrame.dispose();
                }else {
                    new BiaoBaiDialog();
                    sure.setText("叫我一声男票我就走啦！");
                    sure.setBounds(100, 400, 200, 30);
                    jFrame.repaint();
                }

            }
        });
    }

    private static void initContent() {
        jFrame.add(biaoBaiPanel);
    }

    private static void init() {
        // 标题
        jFrame.setTitle("一起去看星星好吗？");
        // 窗体大小
        jFrame.setSize(500, 500);
        // 设置可见
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}

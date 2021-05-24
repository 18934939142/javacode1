// TextEditor.java
package 课本代码.com.project8;

import java.awt.*;
import java.awt.event.*; // �������е��¼���
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;

public class TextEditor extends Frame implements ActionListener {
	MenuBar mainmenubar = new MenuBar(); // �����˵���
	Menu file; // �������˵���
	MenuItem nw; // �������Ӳ˵���
	MenuItem op;
	MenuItem cl;
	MenuItem sf;
	MenuItem ex;
	TextArea tx; // �����ı�������

	public TextEditor(String title) {
		super(title); // ���ø��๹�췽��
		CloseHandler handler = new CloseHandler(); // ���崰���¼�������������
		this.addWindowListener(handler); // Ϊ��ǰ����ע������������
		setSize(400, 400); // ���ô���ߴ�
		setLocationRelativeTo(null); // ʹ��������Ļ�Ͼ��з���
		menuinit(); // �����봦��˵�
		tx = new TextArea(); // �����ı�������
		this.add(tx); // ���ı���������봰��
		setVisible(true); // ʹ����ɼ�
	}

	// �˵������봦��
	void menuinit() {
		mainmenubar = new MenuBar(); // �������˵���
		file = new Menu("�ļ�"); // �������˵���file
		nw = new MenuItem("�½��ļ�"); // ������Ӳ˵���
		op = new MenuItem("���ļ�");
		cl = new MenuItem("�ر��ļ�");
		sf = new MenuItem("�����ļ�");
		ex = new MenuItem("��          ��");
		file.add(nw); // �����Ӳ˵�����뵽���˵�����
		file.add(op);
		file.add(cl);
		file.add(sf);
		file.add(ex);
		mainmenubar.add(file); // �����˵�����뵽���˵���
		setMenuBar(mainmenubar); // Ϊ�����������˵�
		nw.addActionListener(this); // Ϊ���˵���ע���¼�������
		op.addActionListener(this);
		cl.addActionListener(this);
		sf.addActionListener(this);
		ex.addActionListener(this);
	}

	// �����ActionEvent�¼�������
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource(); // ��ȡ�¼�����
		JFileChooser f = new JFileChooser(); // �����ļ�ѡ��������
		if ((ob == nw) || (ob == cl)) { // ѡ��"�½��ļ�"��"�ر��ļ�"�Ӳ˵���
			tx.setText(""); // ����ı���
		} else if (ob == op) { // ѡ��"���ļ�"�Ӳ˵���
			// ���������Զ��� approve ��ť���Զ����ļ�ѡ�����Ի���
			f.showOpenDialog(this);
			try {
				// ����һ���ַ�����������s
				StringBuffer s = new StringBuffer();
				// ����һ��FileReadder����in�������Ϊ���ļ�ѡ����
				// �Ի�����ѡ�е��ļ�
				FileReader in = new FileReader(f.getSelectedFile());
				// �����ļ����ݣ���������ַ�����������s��
				while (true) {
					int b = in.read();
					if (b == -1) {
						break;
					}
					s.append((char) b);
				}
				tx.setText(s.toString()); // ���ļ�������ʾ���ı���
				in.close(); // �ر��ļ�
			} catch (Exception ee) {
			}
		} else if (ob == sf) { // ѡ��"�����ļ�"�Ӳ˵���
			f.showSaveDialog(this); // ��ʾ�ļ�ѡ��Ի���
			try {
				// ����FileWriter���������Ϊǰ��ѡ����ļ�
				FileWriter out = new FileWriter(f.getSelectedFile());
				out.write(tx.getText()); // ���ı�������д���ļ�
				out.close(); // �ر��ļ�
			} catch (Exception ee) {
			}
		} else if (ob == ex) // ѡ��"��    ��"�Ӳ˵���
		{
			System.exit(0); // �˳�ϵͳ
		}
	}

	public static void main(String[] args) {
		new TextEditor("�����ı��༭��");
	}
}

// CloseHandler��ʵ�ֹرմ��ڵĹ���
class CloseHandler extends WindowAdapter { // �̳���������
	@Override
	public void windowClosing(WindowEvent e) { // ����رմ����¼��ķ���
		System.exit(0); // ��ֹ��ǰ�߳�
	}
}

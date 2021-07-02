package score;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Score extends JFrame implements ActionListener, MouseListener{
	ScoreDAO scoreDAO;//만들고 왔습니다.
	ScoreDTO scoreDTO;//만들고 왔습니다.
	JLabel jlName, jlKor, jlEng, jlMat;
	JTextField jtName, jtKor, jtEng, jtMat;
	JButton jbAdd, jbDel, jbChange;
	JTable table;
	Vector data, col;
	
	public Score() {//생성자 호출
		setLayout(null);
		scoreDAO = new ScoreDAO();
		
		//이름
		add(jlName = new JLabel("이름", JLabel.CENTER));
		jlName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlName.setBorder(BorderFactory.createBevelBorder(0));
		jlName.setBounds(10, 10, 120, 50);
		add(jtName = new JTextField());
		jtName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtName.setHorizontalAlignment(JTextField.CENTER);
		jtName.setBounds(140, 10, 120, 50);
		
		//국어
		add(jlKor = new JLabel("국어점수", JLabel.CENTER));
		jlKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlKor.setBorder(BorderFactory.createBevelBorder(0));
		jlKor.setBounds(10, 70, 120, 50);
		add(jtKor = new JTextField());
		jtKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtKor.setHorizontalAlignment(JTextField.CENTER);
		jtKor.setBounds(140, 70, 120, 50);
		
		//영어
		add(jlEng = new JLabel("영어점수", JLabel.CENTER));
		jlEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlEng.setBorder(BorderFactory.createBevelBorder(0));
		jlEng.setBounds(10, 130, 120, 50);
		add(jtEng = new JTextField());
		jtEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtEng.setHorizontalAlignment(JTextField.CENTER);
		jtEng.setBounds(140, 130, 120, 50);
		
		//수학
		add(jlMat = new JLabel("수학점수", JLabel.CENTER));
		jlMat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlMat.setBorder(BorderFactory.createBevelBorder(0));
		jlMat.setBounds(10, 190, 120, 50);
		add(jtMat = new JTextField());
		jtMat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtMat.setHorizontalAlignment(JTextField.CENTER);
		jtMat.setBounds(140, 190, 120, 50);
		
		//버튼
		add(jbAdd =  new JButton("추가"));
		jbAdd.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbAdd.setBounds(270, 10, 120, 50);
		jbAdd.addActionListener(this);
		add(jbDel = new JButton("제거"));
		jbDel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbDel.setBounds(270, 70, 120, 50);
		jbDel.addActionListener(this);
		add(jbChange = new JButton("수정"));
		jbChange.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbChange.setBounds(270, 130, 120, 50);
		jbChange.addActionListener(this);
		
		//컬럼데이터
		col = new Vector();
		col.add("이름");
		col.add("국어점수");
		col.add("영어점수");
		col.add("수학점수");
		col.add("총점");
		col.add("평균");
				
		//테이블 수정 못하게 막기
		DefaultTableModel model = 
				new DefaultTableModel(scoreDAO.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		//스크롤
		table = new JTable(model);
		table.addMouseListener(this);
		JScrollPane scroll = new JScrollPane(table);
		jTableSet();//테이블을 갱신하는 메소드
		add(scroll);
		scroll.setBounds(415, 10, 600, 250);
		
		//창크기 계산
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1200) / 2,
				(screenSize.height - 300) / 2);
		
		//보여주기, 크기 수정불가 설정
		setSize(1200, 300);
		setResizable(false);
		setTitle("성적 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}//생성자
	
	//jTableSet()
	public void jTableSet() {
		//이동과 길이조절 등등을 모두 막습니다.
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		//컬럼 정렬에 필요한 메소드
		DefaultTableCellRenderer cellAlignCenter = 
				new DefaultTableCellRenderer();
		cellAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		DefaultTableCellRenderer celAlignRight = 
				new DefaultTableCellRenderer();
		celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		
		DefaultTableCellRenderer celAlignLeft = 
				new DefaultTableCellRenderer();
		celAlignLeft.setHorizontalAlignment(JLabel.LEFT);
		
		//컬럼별 사이즈 조절과 정렬하기
		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(0).setCellRenderer(cellAlignCenter);
		
		table.getColumnModel().getColumn(1).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setCellRenderer(cellAlignCenter);
		
		table.getColumnModel().getColumn(2).setPreferredWidth(10);
		table.getColumnModel().getColumn(2).setCellRenderer(cellAlignCenter);
		
		table.getColumnModel().getColumn(3).setPreferredWidth(10);
		table.getColumnModel().getColumn(3).setCellRenderer(cellAlignCenter);
		
		table.getColumnModel().getColumn(4).setPreferredWidth(10);
		table.getColumnModel().getColumn(4).setCellRenderer(cellAlignCenter);
		
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setCellRenderer(cellAlignCenter);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//메인메소드 이게 있어야 실행가능합니다.
	public static void main(String[] args) {
		new Score();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

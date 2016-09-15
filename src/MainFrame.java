import java.awt.*;
import java.awt.event.*;
public class MainFrame extends Frame{
	//for the midterm,Finalterm,project,and two more fields for others
	private TextField tf1 = new TextField("0");
	private TextField tf2 = new TextField("0");
	private TextField tf3 = new TextField("0");
	private TextField tf4 = new TextField("0");
	private TextField tf5 = new TextField("0");
	//for the student id 
	private TextField sid = new TextField("0");
	//for the 5 percentages
	private TextField pc1 = new TextField("0");
	private TextField pc2 = new TextField("0");
	private TextField pc3 = new TextField("0");
	private TextField pc4 = new TextField("0");
	private TextField pc5 = new TextField("0");
	private Label lab1=new Label("Insert Grades");
	private Label lab2=new Label("¡õInsert Percentages % for each grades¡õ");
	private Label lab3=new Label("%");
	private Button btnRun = new Button("­pºâ");
	private Button btnExit= new Button("µ²§ô");
	private TextArea ta=new TextArea();
	public MainFrame(){
		initComp();
	}
	private void initComp(){
		this.setLayout(null);
		this.setBounds(200,100,580,500);
		this.setBackground(new Color(128,205,20));
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		tf1.setBounds(50,70,80,25);
		tf1.setBackground(Color.yellow);
		tf2.setBounds(150,70,80,25);
		tf2.setBackground(Color.yellow);
		tf3.setBounds(250,70,80,25);
		tf3.setBackground(Color.yellow);
		tf4.setBounds(350,70,80,25);
		tf4.setBackground(Color.yellow);
		tf5.setBounds(450,70,80,25);
		tf5.setBackground(Color.yellow);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.add(tf5);
		lab1.setBounds(230, 40, 120, 30);
		lab1.setAlignment(Label.CENTER);
		this.add(lab1);
		lab2.setBounds(140, 95, 300, 30);
		lab2.setAlignment(Label.CENTER);
		this.add(lab2);
		pc1.setBounds(50,125,80,25);
		pc1.setBackground(Color.white);
		pc2.setBounds(150,125,80,25);
		pc2.setBackground(Color.white);
		pc3.setBounds(250,125,80,25);
		pc3.setBackground(Color.white);
		pc4.setBounds(350,125,80,25);
		pc4.setBackground(Color.white);
		pc5.setBounds(450,125,80,25);
		pc5.setBackground(Color.white);
		this.add(pc1);
		this.add(pc2);
		this.add(pc3);
		this.add(pc4);
		this.add(pc5);
		btnRun.setBounds(50,150,220,30);
		btnExit.setBounds(310,150,220,30);
		this.add(btnRun);
		this.add(btnExit);
	}
}

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class popupDeleteSucess extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 30); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(169, 245, 197); Color c3= new Color(0,0,0);
	popupDeleteSucess(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("Successfully Deleted");
		b2= new Button("OK");
		l1.setFont(f2);
		//l1.setForeground(c2);
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(295,100,350,40);
		b2.setBounds(380,164,100,40);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}
class popupDeleteFailed extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 27); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(173, 5, 5); Color c3= new Color(247, 247, 247);
	popupDeleteFailed(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("ERROR:  Enter Valid Name");
		b2= new Button("Close");
		l1.setFont(f2);
		//l1.setForeground(c2);
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(280,100,350,40);
		b2.setBounds(390,165,100,40);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}
class FrameDelete extends Frame implements ActionListener
{
	popupDeleteFailed pd1; popupDeleteSucess ps1;
	Label Lbname, Mname; TextField Tbname; Button delete;
	Font f1= new Font("Times Now Roman", Font.BOLD, 48);
	Font f2= new Font("Times Now Roman", Font.BOLD, 19);
	Font f3= new Font("Times Now Roman", Font.BOLD, 25);
	Color c1= new Color(235, 216, 216);
	Color c2= new Color(199, 38, 38);
	Color c3= new Color(247, 247, 247);
	String str1="";
	FrameDelete(String str)
	{
		super(str);
		setLayout(null);
		pd1= new popupDeleteFailed("ERROR");  ps1= new popupDeleteSucess("Done");
		Mname= new Label("Deleting The Book");
		Lbname= new Label("Enter Book Name You Want To Delete");
		Tbname= new TextField(110);
	    delete= new Button("Delete");
		Mname.setBounds(140,60,480,70);
		Lbname.setBounds(190,180,500,70);
		Tbname.setBounds(130,248,430,50);
		delete.setBounds(270,360,120,60);
		
		Mname.setFont(f1); Lbname.setFont(f2); Tbname.setFont(f3); delete.setFont(f3);
		
		setBackground(c1);
		Mname.setForeground(c2);
		delete.setBackground(c2);
		delete.setForeground(c3);
		delete.setVisible(false);
		
		add(Mname); add(Lbname); add(Tbname); add(delete);
		
		
		
		addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
                Tbname.setText(null);
			}
	     });
		 
		 delete.addActionListener(this);
		Tbname.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//if(ae.getSource()==delete)
		//{
			try{
				str1=Tbname.getText()+".txt";
			File f1=new File("..//Books//"+Tbname.getText()+".txt");
				if(f1.exists())
				{
					delete.setVisible(true);
					if(ae.getSource()== delete)
					{
						f1.delete();
						ps1.setVisible(true);
						ps1.setSize(1000,270);
                        Tbname.setText(null);
					}
				}
				else
				{
					pd1.setVisible(true);
					pd1.setSize(1000,270);
                    Tbname.setText(null);
				}
			
			}catch(Exception ex)
			{
				
			}
		//}
		repaint();
	}
}
class popupAddSucess extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 30); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(169, 245, 197); Color c3= new Color(0,0,0);
	popupAddSucess(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("Successfully Created");
		b2= new Button("OK");
		l1.setFont(f2);
		//l1.setForeground(c2);
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(295,100,350,40);
		b2.setBounds(380,164,100,40);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}
class popupAddFailed extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 27); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(173, 5, 5); Color c3= new Color(247, 247, 247);
	popupAddFailed(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("ERROR: Book Name Cannot Be Empty");
		b2= new Button("Close");
		l1.setFont(f2);
		//l1.setForeground(c2);
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(280,100,400,40);
		b2.setBounds(390,165,100,40);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}
class AddBook extends Frame implements ActionListener
{
 TextField BookName,BookPublisher,BookAuthor;
 Label Name,Publisher,PublishingYear,Aurthor,BookFor,Sem,AnnualYear,Pages,Quantity,Status,Add,Shelf,Row;
 Choice No_Of_Year,No_Of_Semester,Annual_No_Year,No_Of_Pages,No_Of_Quantity,No_Of_Shelf,No_Of_Row;
 CheckboxGroup Issue_Status;
 Checkbox Issue,None;
 Button Save;
 popupAddSucess PAS; popupAddFailed PAF;
 AddBook()
 {
  setLayout(null);
  setBackground(Color.GRAY);   
  Font Ft=new Font("Arial",Font.PLAIN,25);

  PAS=new popupAddSucess("Successfully Created");
  PAF=new popupAddFailed("Failed to Create");

  BookName=new TextField(80);
  add(BookName); BookName.setFont(Ft);
  BookName.setBounds(250,40,400,35);
  BookName.addActionListener(this);

  BookPublisher=new TextField(80);
  add(BookPublisher); BookPublisher.setFont(Ft);
  BookPublisher.setBounds(250,110,400,35);

  BookAuthor=new TextField(80); 
  add(BookAuthor); BookAuthor.setFont(Ft);
  BookAuthor.setBounds(250,250,400,35);

  Name=new Label("Name Of Book: ",Label.RIGHT);
  add(Name); Name.setFont(Ft);
  Name.setBounds(50,30,200,50);
  
  Publisher=new Label("Publisher:",Label.RIGHT);
  add(Publisher); Publisher.setFont(Ft);
  Publisher.setBounds(50,100,200,50);

  PublishingYear=new Label("Year Of Publishing:",Label.RIGHT);
  add(PublishingYear); PublishingYear.setFont(Ft);
  PublishingYear.setBounds(50,170,250,50);

  Aurthor=new Label("Aurthor:",Label.RIGHT);
  add(Aurthor); Aurthor.setFont(Ft);
  Aurthor.setBounds(50,240,200,50);

  BookFor=new Label("This Book is For:",Label.RIGHT);
  add(BookFor); BookFor.setFont(Ft);
  BookFor.setBounds(50,310,250,50);
  Sem=new Label("Semester",Label.LEFT);
  add(Sem); Sem.setFont(Ft);
  Sem.setBounds(360, 310,115,50);

  AnnualYear=new Label("Year ",Label.LEFT);
  add(AnnualYear); AnnualYear.setFont(Ft);
  AnnualYear.setBounds(540,310,115,50);

  Pages=new Label("No. of Pages:",Label.RIGHT);
  add(Pages); Pages.setFont(Ft);
  Pages.setBounds(50, 380,200,50);

  Quantity=new Label("Quantity:",Label.RIGHT);
  add(Quantity); Quantity.setFont(Ft);
  Quantity.setBounds(350,380,150,50);

  Status=new Label("Current Status: ",Label.RIGHT);
  add(Status); Status.setFont(Ft);
  Status.setBounds(50,450,200,50);

  Add=new Label("Added To:",Label.RIGHT);
  add(Add); Add.setFont(Ft);
  Add.setBounds(50,520,200,50);
  Shelf=new Label("Shelf",Label.LEFT);
  add(Shelf); Shelf.setFont(Ft);
  Shelf.setBounds(310,520,70,50);
  Row=new Label("Row ",Label.LEFT);
  add(Row); Row.setFont(Ft);
  Row.setBounds(450,520,70,50);
  
  No_Of_Year=new Choice();
  add(No_Of_Year); No_Of_Year.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Year.setBounds(300,185,100,50);
  int i=1975;
  while (i<2023) 
  {
   No_Of_Year.add(Integer.toString(i));   
   i++;   
  }

  No_Of_Semester=new Choice();
  add(No_Of_Semester); No_Of_Semester.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Semester.setBounds(300,320,50,50);
  int j=1;
  while (j<9) 
  {
   No_Of_Semester.add(Integer.toString(j));   
   j++;   
  }

  Annual_No_Year=new Choice();
  add(Annual_No_Year); Annual_No_Year.setFont(new Font("Arial",Font.PLAIN,18));
  Annual_No_Year.setBounds(480, 320,50,50);
  int k=1;
  while (k<5) 
  {
   Annual_No_Year.add(Integer.toString(k));
   k++;   
  }

  No_Of_Pages=new Choice();
  add(No_Of_Pages); No_Of_Pages.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Pages.setBounds(250,395,100,50);
  int l=0;
  while (l<2001) 
  {
   No_Of_Pages.add(Integer.toString(l));   
   l=l+100;   
  }

  No_Of_Quantity=new Choice();
  add(No_Of_Quantity); No_Of_Quantity.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Quantity.setBounds(500,395,50,50);
  int m=1;
  while (m<11) 
  {
   No_Of_Quantity.add(Integer.toString(m));
   m++;   
  }

  No_Of_Shelf=new Choice();
  add(No_Of_Shelf); No_Of_Shelf.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Shelf.setBounds(250,535,50,50);
  int n=1;
  while (n<11) 
  {
   No_Of_Shelf.add(Integer.toString(n));   
   n++;   
  }

  No_Of_Row=new Choice();
  add(No_Of_Row); No_Of_Row.setFont(new Font("Arial",Font.PLAIN,18));
  No_Of_Row.setBounds(390,535,50,50);
  int p=1;
  while (p<11) 
  {
   No_Of_Row.add(Integer.toString(p));
   p++;   
  }

  Issue_Status=new CheckboxGroup();
  Issue=new Checkbox("Issued",false,Issue_Status);
  None=new Checkbox("Not Issued",true,Issue_Status);
  add(Issue); Issue.setFont(Ft); Issue.setBounds(250,450,100,50);
  add(None);  None.setFont(Ft);  None.setBounds(350,450,200,50);
  Issue.setEnabled(false);
  None.setEnabled(false);
  Save=new Button("Save & Close");
  add(Save); Save.setFont(Ft);
  Save.setBounds(300,700,200,50);
  Save.setBackground(Color.CYAN);
  Save.addActionListener(this);
  addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
  
 }

 public void actionPerformed(ActionEvent e) 
 {
  String str=e.getActionCommand();
  String Not=BookName.getText();
  if (str.equals("Save & Close") && Not.equals("")) 
  {
   PAF.setVisible(true); 
    PAF.setSize(1000,270); 
  } 
  else
  {
    write();
     PAS.setVisible(true);
     PAS.setSize(1000,270);
     BookName.setText(null);
     BookPublisher.setText(null);
     BookAuthor.setText(null);
     No_Of_Year.select(0);
     No_Of_Semester.select(0);
     Annual_No_Year.select(0);
     No_Of_Pages.select(0);
     No_Of_Quantity.select(0);
     No_Of_Shelf.select(0);
     No_Of_Row.select(0);
     dispose(); 
  }   
 }

 public void write()
 {
  try 
  {
   File myfile=new File("..//Books//"+BookName.getText()+".txt");
   myfile.createNewFile();
   FileWriter fileWriter = new FileWriter(myfile);
   fileWriter.write(Name.getText()+""+BookName.getText());
   fileWriter.write("\n"+Publisher.getText()+""+BookPublisher.getText());
   fileWriter.write("\n"+PublishingYear.getText()+""+No_Of_Year.getSelectedItem());
   fileWriter.write("\n"+Aurthor.getText()+""+BookAuthor.getText());
   fileWriter.write("\n"+BookFor.getText()+"_"+No_Of_Semester.getSelectedItem()+"_"+Sem.getText()+"_and_"+Annual_No_Year.getSelectedItem()+"_"+AnnualYear.getText());
   fileWriter.write("\n"+Pages.getText()+"_"+No_Of_Pages.getSelectedItem()+"_"+Quantity.getText()+"_"+No_Of_Quantity.getSelectedItem());
   fileWriter.write("\n"+Status.getText()+" "+Issue_Status.getSelectedCheckbox().getLabel());
   fileWriter.write("\n"+Add.getText()+"_"+No_Of_Shelf.getSelectedItem()+"_"+Shelf.getText()+"_and_"+No_Of_Row.getSelectedItem()+"_"+Row.getText());
   fileWriter.close();
   
  } 
  catch (Exception e) 
  {
   BookName.setText(" "+e);     
  }

 }
    
}
class ViewBook extends Frame implements ActionListener 
{
 Label L1,L3;
 Button B1,B2,B3;
 List mylist;
 TextField TF;
 TextArea TA;
 ViewBook()
 {
  setLayout(null);
  
  setBackground(Color.GRAY);
  L1=new Label("View Book");
  add(L1);
  L1.setBounds(400, 50,300,50);
  L1.setFont(new Font("Arial",Font.BOLD,45));


  L3=new Label("List Of Books");
  add(L3);
  L3.setBounds(50,100,160,50);
  L3.setFont(new Font("Arial",Font.PLAIN,25));

  TF=new TextField();
  add(TF);
  TF.setBounds(300, 110,450,40);
  TF.setFont(new Font("Arial",Font.PLAIN,25));
  TF.addActionListener(this);

  B1=new Button("Search Book");
  add(B1);
  B1.setBounds(800, 110,180,40);
  B1.setFont(new Font("Arial",Font.PLAIN,25));
  B1.addActionListener(this);
  
  mylist=new List();
  add(mylist);
  mylist.setBounds(10,150,270,500);
  mylist.setFont(new Font("Arial",Font.PLAIN,25));
  mylist.addActionListener(this);

  B2=new Button("Get Info");
  add(B2);
  B2.setBounds(40,700,150,40);
  B2.setFont(new Font("Arial",Font.PLAIN,25));
  B2.addActionListener(this);

  TA=new TextArea("",100,100,TextArea.SCROLLBARS_NONE);
  add(TA);
  TA.setBounds(300,175,750,500);
  TA.setFont(new Font("Arial",Font.PLAIN,25));
  TA.setEnabled(false);

  B3=new Button("Close");
  add(B3);
  B3.setBounds(500,800,100,40);
  B3.setFont(new Font("Arial",Font.PLAIN,25));
  B3.addActionListener(this);

 
  File myfile=new File("..//Books");//(..//LIBRARYMANAGEMENT)
  String filenames[]=myfile.list();
  for(int x=0;x<filenames.length;x++)
  {
   if (filenames[x].indexOf(".txt")>=0) 
   {
    mylist.add(filenames[x]);   
   }
  }
  
 
  addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });

 }
   
 public void actionPerformed(ActionEvent ae) 
 {
  String str=ae.getActionCommand();
  if (str.equals("Search Book")) 
  {
    Read();  
  } 
  else if(str.equals("Get Info"))
  {
     Read2(); 
  }
  else if(str.equals("Close"))
  {
   dispose();
   TF.setText(null);
   TA.setText(null);   
  }
 }
 
 public void Read()
 {
    try  
    {
    String str1=TF.getText()+".txt";  
     File f1=new File("..//Books//"+str1);
     if (f1.exists()) 
     {
        FileReader obj = new FileReader(f1);
	    int i;
	    TA.setText("");
        
	    while((i=obj.read())!= -1)
	    {
		TA.setText(TA.getText()+(char)i);
	    }

	    obj.close();   
     }
    }
    catch (Exception e) 
    {
       
    }

 }
 
 public void Read2()
 {
    String filename=mylist.getSelectedItem();
    try
	{
	    FileReader obj = new FileReader("..//Books//"+filename);
        //BufferedReader Br=new BufferedReader(obj);
	    int i;
	    TA.setText("");
	    while((i=obj.read())!= -1)
	    {
		TA.setText(TA.getText()+(char)i);
	    }
      
	    obj.close();
	}
	catch(Exception E)
	{
	    TA.setText(E.getMessage());		
	}   
 }

} 

class UpdateBookSuccessful extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 30); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(169, 245, 197); Color c3= new Color(0,0,0);
	UpdateBookSuccessful(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("Successfully Updated");
		b2= new Button("OK");
		l1.setFont(f2);
		//l1.setForeground(c2);   
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(295,100,350,40);
		b2.setBounds(380,164,100,40);
        setSize(1000,270);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}
class UpdateBookValidName extends Frame implements ActionListener
{
	Label l1; Button b2;
	Font f2= new Font("serif", Font.PLAIN, 27); Font f3= new Font("Times Now Roman", Font.BOLD, 15);
	Color c2= new Color(173, 5, 5); Color c3= new Color(247, 247, 247);
	UpdateBookValidName(String str)
	{
		super(str);
		setLayout(null);
		l1= new Label("ERROR:  Enter Valid Name");
		b2= new Button("Close");
		l1.setFont(f2);
		//l1.setForeground(c2);
		b2.setBackground(c2);
		b2.setForeground(c3);
		b2.setFont(f3);
		l1.setBounds(280,100,350,40);
		b2.setBounds(390,165,100,40);
        setSize(1000,270);
		add(l1);
		add(b2);
		b2.addActionListener(this);
		
			addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b2)
		{
			dispose();
		}
		repaint();
	}
	
}


class UpdateBook extends Frame implements ActionListener, ItemListener  
{
    TextField BookName, BookPublisher, BookAuthor, tIssuedId;
    TextField noYear, noSem, anuYear, noPages, noQuan, noShelf, noRow ;
    Label Name, Publisher, PublishingYear, Aurthor, BookFor, Sem, AnnualYear, Pages, Quantity, Status, Add, Shelf, Row, lIssuedId, lIssuedBY, blank, head;
    CheckboxGroup Issue_Status;
    Checkbox Issue, None;
    Button Save, delete, add1;
	String str1=""; String amt="";  String No_Of_Year_pass=""; String py=""; String replace=""; String blankText="";
    UpdateBookValidName pd1;  UpdateBookSuccessful ps1;
    int condition;
    UpdateBook() 
    {
        setLayout(null);
        setBackground(Color.GRAY);
        Font Ft = new Font("Arial", Font.PLAIN, 23);
        Font Ft2 = new Font("serif", Font.BOLD, 42);

         pd1= new UpdateBookValidName("ERROR");   ps1= new UpdateBookSuccessful("UPDATED");

        BookName = new TextField(80);
        add(BookName);  
        BookName.setFont(Ft);   // BookName.setEnabled(false);
        BookName.setBounds(250, 160, 400, 35);

        BookPublisher = new TextField(80);
        add(BookPublisher);
        BookPublisher.setFont(Ft); BookPublisher.setEnabled(false);
        BookPublisher.setBounds(250, 230, 400, 35);

        BookAuthor = new TextField(80);
        add(BookAuthor);
        BookAuthor.setFont(Ft); BookAuthor.setEnabled(false);
        BookAuthor.setBounds(250, 370, 400, 35);

        Name = new Label("Name Of Book: ", Label.RIGHT);
        add(Name);
        Name.setFont(Ft);
        Name.setBounds(50, 150, 200, 50);

        Publisher = new Label("Publisher:", Label.RIGHT);
        add(Publisher);
        Publisher.setFont(Ft);
        Publisher.setBounds(50, 220, 200, 50);

        PublishingYear = new Label("Year Of Publishing:", Label.RIGHT);
        add(PublishingYear);
        PublishingYear.setFont(Ft);
        PublishingYear.setBounds(50, 290, 250, 50);

        Aurthor = new Label("Aurthor:", Label.RIGHT);
        add(Aurthor);
        Aurthor.setFont(Ft);
        Aurthor.setBounds(50, 360, 200, 50);

        BookFor = new Label("This Book is For:", Label.RIGHT);
        add(BookFor);
        BookFor.setFont(Ft);
        BookFor.setBounds(50, 430, 250, 50);
        Sem = new Label("Semester", Label.LEFT);
        add(Sem);
        Sem.setFont(Ft);
        Sem.setBounds(377, 430, 115, 50);

        AnnualYear = new Label("Year ", Label.LEFT);
        add(AnnualYear);
        AnnualYear.setFont(Ft);
        AnnualYear.setBounds(560, 430, 115, 50);

        Pages = new Label("No. of Pages:", Label.RIGHT);
        add(Pages);
        Pages.setFont(Ft);
        Pages.setBounds(50, 500, 200, 50);

        Quantity = new Label("Quantity:", Label.RIGHT);
        add(Quantity);
        Quantity.setFont(Ft);
        Quantity.setBounds(350, 500, 150, 50);

        Status = new Label("Current Status: ", Label.RIGHT);
        add(Status);
        Status.setFont(Ft);
        Status.setBounds(50, 640, 200, 50);

        Add = new Label("Added To:", Label.RIGHT);
        add(Add);
        Add.setFont(Ft);
        Add.setBounds(50, 560, 200, 50);
        Shelf = new Label("Shelf", Label.LEFT);
        add(Shelf);
        Shelf.setFont(Ft);
        Shelf.setBounds(335, 560, 70, 50);
        Row = new Label("Row ", Label.LEFT);
        add(Row);
        Row.setFont(Ft);
        Row.setBounds(480, 560, 70, 50);

        noYear = new TextField(30); add(noYear);
        noYear.setFont(new Font("Arial", Font.PLAIN, 20));
        noYear.setBounds(300, 300, 90, 36);  noYear.setEnabled(false);

        noSem = new TextField(30); add(noSem);
        noSem.setFont(new Font("Arial", Font.PLAIN, 20));
        noSem.setBounds(300, 435, 60, 36);   noSem.setEnabled(false);

        anuYear = new TextField(30); add(anuYear);
        anuYear.setFont(new Font("Arial", Font.PLAIN, 20));
        anuYear.setBounds(490, 433, 60, 34);   anuYear.setEnabled(false);

        noPages = new TextField(30); add(noPages);
        noPages.setFont(new Font("Arial", Font.PLAIN, 20));
        noPages.setBounds(250, 505, 90, 34);   noPages.setEnabled(false);

        noQuan = new TextField(20); add(noQuan);
        noQuan.setFont(new Font("Arial", Font.PLAIN, 20));
        noQuan.setBounds(500, 505, 60, 34);   noQuan.setEnabled(false);

        noShelf = new TextField(30); add(noShelf);
        noShelf.setFont(new Font("Arial", Font.PLAIN, 20));
        noShelf.setBounds(250, 570, 60, 34);   noShelf.setEnabled(false);

        noRow = new TextField(30); add(noRow);
        noRow.setFont(new Font("Arial", Font.PLAIN, 20));
        noRow.setBounds(403, 567, 80, 34);   noRow.setEnabled(false);

        Issue_Status = new CheckboxGroup();
        Issue = new Checkbox("Issued", false, Issue_Status);
        None = new Checkbox("Not Issued", true, Issue_Status);
        add(Issue);
        Issue.setFont(Ft);
        Issue.setBounds(250, 640, 100, 50);
        add(None);
        None.setFont(Ft);
        None.setBounds(350, 640, 175, 50);
        
        Save = new Button("Save & Close");
        add(Save);
        Save.setFont(Ft);
        Save.setBounds(550,900, 200, 50);
        Save.setBackground(Color.CYAN);

        delete = new Button("Return");
        add(delete);
        delete.setFont(Ft);
        delete.setBounds(330, 900, 150, 50);
        delete.setBackground(Color.red);

        add1 = new Button("Issue");
        add(add1);
        add1.setFont(Ft);
        add1.setBounds(115, 900, 150, 50);
        add1.setBackground(Color.green);
		
		lIssuedId= new Label("Issuing/Returning  ID No: ");      
		lIssuedId.setBounds(80, 790, 280, 40);	                
		lIssuedId.setFont(Ft);					               
		lIssuedId.setVisible(false);			               
		add(lIssuedId);							               

        tIssuedId= new TextField(100); 
        tIssuedId.setBounds(360, 790, 200, 40);
        tIssuedId.setFont(Ft);
        tIssuedId.setVisible(false);
        add(tIssuedId);

        lIssuedBY= new Label("Issued By ID No: ");
		lIssuedBY.setBounds(80, 715, 180, 40);
        lIssuedBY.setFont(Ft);  
        add(lIssuedBY);
        blank= new Label("None");
		blank.setBounds(260, 715, 600, 40);
        blank.setFont(Ft);  
        add(blank);

        head= new Label("Issuing/Returning of Book");
		head.setBounds(150, 55, 700, 70);
        head.setFont(Ft2);  
        add(head);
       
		Save.addActionListener(this);  add1.addActionListener(this);  delete.addActionListener(this);
		Issue.addItemListener(this);
		None.addItemListener(this);
        
		addWindowListener(new WindowAdapter ()
		  { public void windowClosing(WindowEvent we)
			{
                BookAuthor.setText(null);   BookAuthor.setText(null);  BookPublisher.setText(null);   BookName.setText(null);  
               None.setState(true);   blank.setText(null);  tIssuedId.setText(null);
                noPages.setText(null);   noQuan.setText(null);  noRow.setText(null);   noSem.setText(null);  
               noShelf.setText(null);   noYear.setText(null);  anuYear.setText(null);
             
				dispose(); 
			}
		  }
		);
        
    }

    public void actionPerformed(ActionEvent ee) {
        if(ee.getSource()==add1)
        {
           
           // Read();
            amt=blankText;
           amt=amt + tIssuedId.getText()+" ";
           blank.setText(amt);
            //Write();
        }

        if(ee.getSource()== delete)
		{
            //Read();
           // replace=blankText;
			replace= amt.replace(tIssuedId.getText(),"");
			blank.setText(replace);
           // Write();
		}

        if(ee.getSource()==Save)
        {
            if(None.getState()==true)
            {
                BookAuthor.setText(null);   BookAuthor.setText(null);  BookPublisher.setText(null);  BookName.setText(null);  None.setState(true);
                blank.setText(null);  tIssuedId.setText(null);
                noPages.setText(null);   noQuan.setText(null);  noRow.setText(null);   noSem.setText(null);  
                noShelf.setText(null);   noYear.setText(null);  anuYear.setText(null);
              
                dispose();
            }
            else{
                 Write();
                BookAuthor.setText(null);   BookAuthor.setText(null);  BookPublisher.setText(null);  BookName.setText(null);  None.setState(true);
                blank.setText(null);  tIssuedId.setText(null);
                noPages.setText(null);   noQuan.setText(null);  noRow.setText(null);   noSem.setText(null);  
                noShelf.setText(null);   noYear.setText(null);  anuYear.setText(null);
        
                ps1.setVisible(true);
                dispose(); 
            } 
        }

      }
    

    public void itemStateChanged(ItemEvent ie) {
       
        if(ie.getSource()==Issue)
        {
            Read();  
        }
        if(ie.getSource()==None)
        {
            BookAuthor.setText(null);   BookAuthor.setText(null);  BookPublisher.setText(null);  BookName.setText(null);
            blank.setText(null);  tIssuedId.setText(null);
            noPages.setText(null);   noQuan.setText(null);  noRow.setText(null);   noSem.setText(null);  
            noShelf.setText(null);   noYear.setText(null);  anuYear.setText(null);
         
        }
	try{
			File f1=new File("..//Books//"+BookName.getText()+".txt");
			if(f1.exists()){
			    
				    lIssuedId.setVisible(true);
			        tIssuedId.setVisible(true);
			    }
		    
			else{ 
                lIssuedId.setVisible(false);
                tIssuedId.setVisible(false);
                None.setState(true);
                BookName.setText("");
                pd1.setVisible(true);
            }
		}catch(Exception exx){}
        
    }

    public void Write() 
    {
 try 
  {
   File myfile=new File("..//Books//"+BookName.getText()+".txt");
   myfile.createNewFile();
   FileWriter fileWriter = new FileWriter(myfile);
     fileWriter.write(Name.getText()+""+BookName.getText());
     fileWriter.write("\n"+Publisher.getText()+""+BookPublisher.getText());
     fileWriter.write("\n"+PublishingYear.getText()+""+noYear.getText());
     fileWriter.write("\n"+Aurthor.getText()+""+BookAuthor.getText());
     fileWriter.write("\n"+BookFor.getText()+"_"+noSem.getText()+"_"+Sem.getText()+"_and_"+anuYear.getText()+"_"+AnnualYear.getText());
     fileWriter.write("\n"+Pages.getText()+"_"+noPages.getText()+"_"+Quantity.getText()+"_"+noQuan.getText());
     fileWriter.write("\n"+Status.getText()+" "+Issue_Status.getSelectedCheckbox().getLabel());
     fileWriter.write("\n"+Add.getText()+"_"+noShelf.getText()+"_"+Shelf.getText()+"_and_"+noRow.getText()+"_"+Row.getText());
     fileWriter.write("\n"+lIssuedId.getText()+""+blank.getText());
     fileWriter.close();
   
  } 
  catch (Exception xe) 
  {
   BookName.setText(" "+xe);     
  }
    }

    public void Read()
    {
        str1=BookName.getText()+".txt";
        File myfile=new File("..//Books//"+BookName.getText()+".txt");

        try {
            String st;
               FileReader fr= new FileReader(myfile);
               BufferedReader br= new BufferedReader(fr);
              while((st=br.readLine()) != null)
              {
                 if(st.contains("Publisher:")){
                     String[] a=st.split(":");
                     BookPublisher.setText(a[1]);
                 }
                 if(st.contains("Aurthor:")){
                     String[] a=st.split(":");
                     BookAuthor.setText(a[1]);
                 }

                if(st.contains("Issuing/Returning  ID No:")){
                    String[] a=st.split(":");
                    blank.setText(a[1]);
                    blankText = blank.getText();
                }
                if(st.contains("Year Of Publishing:")){
                    String[] a=st.split(":");
                    noYear.setText(a[1]);
                }
                if(st.contains("This Book is For:_")){
                    String[] a=st.split("_");
                    noSem.setText(a[1]);
                    anuYear.setText(a[4]);
                }
                if(st.contains("No. of Pages:_")){
                    String[] a=st.split("_");
                    noPages.setText(a[1]);
                    noQuan.setText(a[3]);
                }
               
                if(st.contains("Added To:_")){
                    String[] a=st.split("_");
                    noShelf.setText(a[1]);
                    noRow.setText(a[4]);
                }
               
              }
              br.close();

        } catch (Exception exx) {
            
        }
    }

}


class MainPage extends Frame implements ActionListener
{
 Button addBk,view,update,delete,close;
 AddBook AB;
 FrameDelete FD;
 ViewBook VB;
 UpdateBook UB;
 MainPage()
 {
  setLayout(null);
  setBackground(new Color(182, 169, 26));
  Color c1=new Color(94, 186, 232);
 
  AB=new AddBook();
  FD=new FrameDelete("Deleting Book");
  VB=new ViewBook();
  UB=new UpdateBook();

  addBk=new Button("Add Book");
  addBk.setBounds(200,100,400,75);
  addBk.setFont(new Font("Arial",Font.BOLD,30));
  add(addBk); addBk.setBackground(c1);
  addBk.addActionListener(this);

  view=new Button("View Book Info");
  view.setBounds(200,225,400,75);
  view.setFont(new Font("Arial",Font.BOLD,30));
  add(view); view.setBackground(c1);
  view.addActionListener(this);

  update=new Button("Issue/Return Book");
  update.setBounds(200,350,400,75);
  update.setFont(new Font("Arial",Font.BOLD,30));
  add(update); update.setBackground(c1);
  update.addActionListener(this);

  delete=new Button("Delete Book");
  delete.setBounds(200,475,400,75);
  delete.setFont(new Font("Arial",Font.BOLD,30));
  add(delete); delete.setBackground(c1);
  delete.addActionListener(this);

  close=new Button("Close");
  close.setBounds(350,700,100,75);
  close.setFont(new Font("Arial",Font.BOLD,30));
  add(close); close.setBackground(new Color(103, 233, 159));
  close.addActionListener(this);

  addWindowListener( new WindowAdapter()
	     {
			public void windowClosing(WindowEvent e)  // For closing Frame Window
			{
				dispose();
			}
	     });

              

 }
  
 public void actionPerformed(ActionEvent e) 
 {
  String str=e.getActionCommand();
  if (str.equals("Add Book")) 
  {
   AB.setVisible(true); 
   AB.setSize(900,900);
   AB.setTitle("Adding the Book");
   AB.setLocationRelativeTo(null);   
  } 
  else if(str.equals("View Book Info"))
  {
   VB.setVisible(true);
   VB.setSize(1100,850);
   VB.setTitle("Viewing the Book"); 
   VB.setLocationRelativeTo(null);    
  } 
  else if(str.equals("Issue/Return Book"))
  {
    UB.setVisible(true);
    UB.setSize(850,1000);
    UB.setLocationRelativeTo(null); 
  }
  else if(str.equals("Delete Book"))
  {
   FD.setVisible(true);
   FD.setSize(700,500);  
   FD.setLocationRelativeTo(null);
  }
  else if(str.equals("Close"))
  {
   dispose(); 
  }
 }   
}
public class Main extends Applet implements ActionListener
{
 Label Welcome,AdminLogin,Name,ID;
 Button SignIn;
 TextField username,password;
 MainPage MP;
 public void init()
 {
  setLayout(null);
  setBackground(Color.GRAY);
  MP=new MainPage();
  Welcome=new Label("Library Management Project",Label.CENTER);
  Welcome.setBounds(200,50,475,75);
  Welcome.setFont(new Font("Arial",Font.BOLD,35));
  add(Welcome);

  AdminLogin=new Label("Admin Login",Label.CENTER);
  AdminLogin.setBounds(300,150,200,75);
  AdminLogin.setFont(new Font("Arial",Font.BOLD,30));
  add(AdminLogin);

  Name=new Label("Username");
  Name.setBounds(50, 300, 150,75);
  Name.setFont(new Font("Arial",Font.BOLD,25));
  add(Name);

  ID=new Label("Password");
  ID.setBounds(50, 400, 150,75);
  ID.setFont(new Font("Arial",Font.BOLD,25));
  add(ID);
  
  username=new TextField(50);
  username.setBounds(220, 325,350, 40);
  username.setFont(new Font("Arial",Font.PLAIN,25));
  add(username);
  username.addActionListener(this);

  password=new TextField(50);
  password.setBounds(220, 425,350, 40);
  password.setFont(new Font("Arial",Font.PLAIN,25));
  add(password);
  password.addActionListener(this);
  password.setEchoChar('*');

  SignIn=new Button("Log In");
  SignIn.setBounds(350, 500, 100, 50);
  SignIn.setFont(new Font("Arial",Font.BOLD,25));
  add(SignIn);
  SignIn.addActionListener(this);

  
 }
    
 public void actionPerformed(ActionEvent e) 
 {
  String usd=username.getText();
  String psd=password.getText();
  String str=e.getActionCommand();
  if (str.equals("Log In")) 
  {
   if (usd.equals("arpit123") && psd.equals("hamjade")) 
   {
    MP.setVisible(true);
    MP.setTitle("Main Page");
    MP.setSize(800,800);
    MP.setLocationRelativeTo(null);
    Crtfol();

   } 
   
  }     
 }
 public void Crtfol()
 {
  try 
  {
   File folder=new File("..//Books");
   boolean fol=folder.mkdir();
   if (fol) 
   {
       
   } else 
   {
    folder.mkdir();   
   }   
  } catch (Exception e) 
  {
      
  }
 }
}
/*<applet code=Main.class width=800 height=800></applet>*/
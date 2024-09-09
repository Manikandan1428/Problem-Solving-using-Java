package com.example;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
/**
 * MovieTktReg
 */
public class MovieTktReg {
 public static void main(String[] args) {
    ticket();
 }
class ticket{
    final String dbUrl = "jdbc:mysql://localhost/movieTicketBooking?serverTimezone=UTC";
    final String user = "root";
    final String pwdd ="1328";
    

    JFrame f = new JFrame("MOVIE TICKET BOOKING SYSTEM");
    f.getContentPane().setBackground(Color.BLACK);
    
    JLabel l1,l2,l3,l4;
    JTextField tf1;
    JButton b1,b2;
    JPasswordField p1;

    

    l1 = new JLabel("LOGIN");
    l1.setForeground(Color.decode("#DAF7A6"));
    l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
    l1.setBounds(200, 30, 400,30);

    l2 = new JLabel("Registered Email");
    l2.setForeground(Color.WHITE);
    l2.setBounds(80,100 , 150, 30);

    l3 = new JLabel("Enter Password");
    l3.setForeground(Color.WHITE);
    l3.setBounds(80,200 , 150, 30);

    l4 = new JLabel("Don't have an account? -->");
    l4.setForeground(Color.WHITE);
    l4.setBounds(200,300,170,30);

    tf1 = new JTextField();
    tf1.setBounds(250,100,200,30);
    
    p1 = new JPasswordField();
    p1.setBounds(250,200,200,30);


    b1 = new JButton("LOGIN");
    b1.setBounds(50,300,100,30);
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            f.dispose();
            String email = tf1.getText();
            String passw =new String(p1.getPassword());

            String sqlEmail = "";
            String sqlPwd = "";
            String sqluserType = "";
            String sqlusernm="";

            try {
                Connection lgnCn = DriverManager.getConnection(dbUrl, user, pwdd);
                Statement stmt1 = null;
                stmt1 = lgnCn.createStatement();
                

                String lgnQry = "select Email,pwd,userType,name from user where Email='"+email+"'";
                
                
                ResultSet loginDeets =  stmt1.executeQuery(lgnQry);
                
                while (loginDeets.next()) {
                    sqlEmail = loginDeets.getString("Email");
                    sqlPwd = loginDeets.getString("pwd");
                    sqluserType = loginDeets.getString("userType");
                    sqlusernm=loginDeets.getString("name");
                    
                }
                
                

            } catch (Exception ex) {
                System.out.println(ex);
            }
            String finalSqlusernm = sqlusernm;
            //this is for user login
            if(email.equals(sqlEmail) && passw.equals(sqlPwd) && sqluserType.equals("User") ){
                JOptionPane.showMessageDialog(f,"Login success");

                JFrame sc = new JFrame("SELECT CITY");
                sc.getContentPane().setBackground(Color.black);
                JLabel city,lang;
                JPanel panel = new JPanel();
                panel.setBackground(Color.BLACK);
                JComboBox cb1,cb2;
                JButton hp;

                city = new JLabel("Select City");
                city.setForeground(Color.WHITE);
                city.setBounds(50,50,100,30);

                lang = new JLabel("Movie Langauage");
                lang.setForeground(Color.WHITE);
                lang.setBounds(50,100,150,30);

                String cit[] = {"Bangalore","Mumbai","Chennai","Madurai","Hyderabad","Delhi"};
                cb1 = new JComboBox(cit);
                // cb1.setForeground(Color.WHITE);

                String lan[] = {"Tamil","English","Hindi","Telegu","kannada","Malayalam"};
                cb2 = new JComboBox(lan);
               
                // cb2.setForeground(Color.WHITE);

                hp = new JButton("Next");
               // hp.setForeground(Color.WHITE);
                hp.setBounds(150,50,100,30);
                hp.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        sc.dispose();
                        JFrame hpf = new JFrame("Home Page");
                        hpf.getContentPane().setBackground(Color.black);
                        JLabel hompag,inv,brandName;
                        JButton showButton;


                        
                       
                        
                        hompag = new JLabel("Enjoy your Movie with popcorn not family ;)");
                        hompag.setBounds(600,30,300,30);
                        hompag.setForeground(Color.WHITE);
                        hompag.setFont(new Font("Times New Roman", Font.BOLD, 16));
                
                        inv = new JLabel("WELCOME!");
                        inv.setBounds(700,0,200,30);
                        inv.setForeground(Color.WHITE);
                        inv.setFont(new Font("Times New Roman", Font.BOLD, 20));
                        
                        JDateChooser dateChooser = new JDateChooser();
                        dateChooser.setDateFormatString("dd-MM-yyyy");
                        dateChooser.setDate(Calendar.getInstance().getTime());
                        dateChooser.setBounds(1300, 20, 200, 30);
                        hpf.add(dateChooser);
                        
                        String date=new SimpleDateFormat("dd-MM-yyyy").format(dateChooser.getDate());;
                        
                       
                        brandName=new JLabel(new ImageIcon("C:\\Users\\Manikandan\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-01-26 020915.png"));
                        brandName.setBounds(0,40,400,200);
                        //brandName.setFont(new Font("Inter", Font.BOLD, 30));

                        cb1.setBounds(1100,40,100,20);
                        cb1.setForeground(Color.black);
                        int a=0;
                        String selectedCity = (String) cb1.getSelectedItem();
                        try {
                            Connection thrCn = DriverManager.getConnection(dbUrl, user, pwdd);
                            Statement thrsmt = null;
                            thrsmt = thrCn.createStatement();
                            
                            String thrQry = "SELECT * FROM theatre WHERE tcity='" + selectedCity + "'";
                            
                            ResultSet resultSet =  thrsmt.executeQuery(thrQry);
                            
                            int jp=200;
                            int thrLbl=200;
                            while (resultSet.next()) {
                                a++;
                                String theaterName = resultSet.getString("tname").toUpperCase();
                                String showTimes = resultSet.getString("tshow");
                                String movies=resultSet.getString("tmovies");
                
                                JPanel theaterPanel = new JPanel();
                                theaterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                                theaterPanel.setBounds(400, jp,1050, 30);
                                jp+=50;
                                
                                JLabel theaterLabel = new JLabel(theaterName);
                                theaterLabel.setBounds(100,thrLbl,400,50);
                                theaterLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
                                theaterLabel.setForeground(Color.WHITE);
                                thrLbl+=50;
                                hpf.add(theaterLabel);
                                //theaterPanel.add(theaterLabel);
                                int x=400;
                               
                                String[] showTimesArray = showTimes.split(",");
                                String [] movieArray = movies.split(",");
                                int j=0;
                                for (int i=0;i<showTimesArray.length;i++) {
                                    
                                    if(j==movieArray.length){
                                        j=0;

                                    }

                                   String finalDate=date;
                                    showButton = new JButton(showTimesArray[i]+" -> "+movieArray[j]);
                                    String mov = movieArray[j];
                                    String finalTime=showTimesArray[i];
                                    j++;
                                    showButton.setForeground(Color.black);
                                    showButton.setBounds(x,300,200,30);
                                    x+=200;
                                    showButton.setFont(new Font("Times New Roman", Font.BOLD, 20    ));
                                    
                                    showButton.addActionListener(new ActionListener() {
                                        
                                        public void actionPerformed(ActionEvent e){
                                            
                                            hpf.dispose();
                                            JFrame movieName = new JFrame("REVIEW DETAILS");
                                            movieName.getContentPane().setBackground(Color.black);

                                            JLabel usernamLabel = new JLabel("Name : "+finalSqlusernm);
                                            usernamLabel.setBounds(10,10,300,30);
                                            usernamLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            usernamLabel.setForeground(Color.WHITE);
                                            movieName.add(usernamLabel);

                                            JLabel movnamLabel = new JLabel("Movie : "+mov);
                                            movnamLabel.setBounds(10,50,300,30);
                                            movnamLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            movnamLabel.setForeground(Color.WHITE);
                                            movieName.add(movnamLabel); 
                                           
                                            JLabel dateLabel = new JLabel("Date : "+finalDate);
                                            dateLabel.setBounds(10,90,300,30);
                                            dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            dateLabel.setForeground(Color.WHITE);
                                            movieName.add(dateLabel);

                                            
                                            
                                            JLabel timeLabel = new JLabel("Time : "+finalTime);
                                            timeLabel.setBounds(10,130,300,30);
                                            timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            timeLabel.setForeground(Color.WHITE);
                                            movieName.add(timeLabel);

                                            JLabel thrnamLabel = new JLabel("Theater : "+theaterName);
                                            thrnamLabel.setBounds(10,170,300,30);
                                            thrnamLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            thrnamLabel.setForeground(Color.WHITE);
                                            movieName.add(thrnamLabel);


                                            JLabel location = new JLabel("Location : "+(String) cb1.getSelectedItem());
                                            location.setBounds(10,210,200,20);
                                            location.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            location.setForeground(Color.WHITE);
                                            movieName.add(location);

                                            JLabel langLabel = new JLabel("Language : "+(String) cb2.getSelectedItem());
                                            langLabel.setBounds(10,250,200,20);
                                            langLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                            langLabel.setForeground(Color.WHITE);
                                            movieName.add(langLabel);                                            

                                            
                                            String [] finSeats = new String[100];
                                            int [] a = new int[1];
                                            a[0]=0;
                                            JButton seatSelection = new JButton("Select seat");
                                            seatSelection.setBounds(100,300,100,30);
                                            seatSelection.setForeground(Color.black);
                                            movieName.add(seatSelection);
                                            seatSelection.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e){
                                                    movieName.dispose();

                                                    JFrame seat=new JFrame("SEATS");
                                                    seat.getContentPane().setBackground(Color.BLACK);
    
                                                    int x=0,y=0,hor=1,ver=1,seatno=1;
                                                    char ch='A';
                                                    for (int k=0;k<700;k++) {
                                                        if (hor==6) {
                                                           JLabel space = new JLabel("        STEPS");
                                                            space.setBounds(x,y,100,20);
                                                            space.setForeground(Color.WHITE);
                                                            seat.add(space);
                                                            x+=100;
                                                            hor++;
                                                            continue;
                                                            
                                                            
                                                        }

                                                        if(hor>11){
                                                            hor=1;
                                                            seatno=1;
                                                            x=0;
                                                            y+=50;
                                                            ver++;
                                                            ch++;
                                                            if (ver==11) {
                                                                break;
                                                            }
                                                        }
                                                        
                                                        JButton mySeat = new JButton(String.valueOf(ch)+""+seatno);
                                                        mySeat.setBounds(x,y,60,20);
                                                        mySeat.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                                                        x+=60;
                                                        hor++;
                                                        seatno++;
                                                        String [] selectedSeats = new String[100];
                                                       
                                                        
                                                        String str=""; 
                                                        mySeat.setForeground(Color.BLACK);
                                                        mySeat.addActionListener(new ActionListener() {
                                                            
                                                            
                                                            public void actionPerformed(ActionEvent e) {
                                                                
                                                                
                                                                int b=0;
                                                                // Toggle seat color when clicked
                                                                if (mySeat.getForeground().equals(Color.BLACK)) {
                                                                    mySeat.setForeground(Color.RED); // Change to selected color

                                                                    
                                                                    finSeats[a[0]] = mySeat.getText(); // Copy the selected seat data into finSeats array
                                                                    a[0]=a[0]+1; 
                                                                    b=a[0];                                                                  
                                                                
                                                                } else {
                                                                    mySeat.setForeground(Color.BLACK); // Change back to default color
                                                                    for (int i = 0; i < b; i++) {
                                                                        if (finSeats[i].equals(mySeat.getText())) {
                                                                            // Shift remaining elements to fill the gap
                                                                            for (int j = i; j < b- 1; j++) {
                                                                                finSeats[j] = finSeats[j + 1];
                                                                            }
                                                                            finSeats[b - 1] = null; // Clear the last element
                                                                            b--; // Decrement index as one seat is deselected
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                
                                                            }
                                                        });
                                                        
                                                       seat.add(mySeat);

                                                    
                                                        
                                                    }
                                                    
                                                   

                                                    JButton next = new JButton("Next");
                                                    next.setBounds(50,520,150,30);
                                                    next.setForeground(Color.BLACK);
                                                    next.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));

                                                    next.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e){
                                                            seat.dispose();

                                                            JFrame payment = new JFrame("Payment");
                                                            payment.getContentPane().setBackground(Color.BLACK);

                                                            JLabel selSeats = new JLabel("Selected seats: ");
                                                            selSeats.setBounds(10,20,100,30);
                                                            selSeats.setForeground(Color.WHITE);
                                                            selSeats.setFont(new Font("Times New Roman", Font.BOLD, 15));
                                                            payment.add(selSeats);

                                                            int t=120,u=20;
                                                            
                                                            for (int i = 0; i < a[0]; i++) {
                                                               
                                                                    JLabel seleSeats;
                                                                    if (i==a[0]-1) {
                                                                       seleSeats = new JLabel(finSeats[i]);
                                                                    }
                                                                    else{
                                                                        seleSeats=new JLabel(finSeats[i]+" ,");
                                                                    }
                                                                        seleSeats.setBounds(t, u, 30, 30);
                                                                        t += 30;
                                                                        seleSeats.setForeground(Color.WHITE);
                                                                        seleSeats.setFont(new Font("Times New Roman", Font.BOLD, 15));
                                                                        payment.add(seleSeats);
                                                                
                                                            }                                                            
                                                                                                                      

                                                            payment.setBounds(300,200,400,400);
                                                            payment.setLayout(null);
                                                            payment.setVisible(true);
                                                            payment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                        }
                                                    });
                                                    seat.add(next);                                                   

                                                    JLabel entry = new JLabel("Entry/Exit-->");
                                                    entry.setBounds(550,520,200,30);
                                                    entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                                    entry.setForeground(Color.white);
                                                    seat.add(entry);

                                                    
                                                    JButton screen = new JButton("Hey, leech! Blood is here.");
                                                    screen.setBounds(100,600,500,30);
                                                    screen.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
                                                    seat.add(screen);

                                                    seat.setBounds(300,200,700, 700);
                                                    seat.setLayout(null);
                                                    seat.setVisible(true);
                                                    seat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                   
                                                }
                                            });                                            

                                            movieName.setBounds(400,200,350,500);
                                            // (1550, 970);
                                            movieName.setLayout(null);
                                            movieName.setVisible(true);
                                            movieName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    }    
                                    });
                
                                    // Add action listener if needed
                
                                    theaterPanel.add(showButton);
                                }
                
                                hpf.add(theaterPanel);
                            }
                
                            thrCn.close();
                            }
                            
                         catch (Exception ex) {
                            System.out.println(ex);
                        }
                       
                        
                        
                        hpf.add(hompag); hpf.add(inv);hpf.add(brandName);hpf.add(cb1);
                        hpf.setLayout(new GridLayout(a,1));
                        hpf.setSize(1550, 970);
                        hpf.setLayout(null);
                        hpf.setVisible(true);
                        hpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                panel.add(city);
                panel.add(cb1);
                
                panel.add(lang);
                panel.add(cb2);

                sc.add(hp);

                sc.add(panel);

                sc.setBounds(500,100,450,150);
                sc.setVisible(true);
                
                sc.setLayout(null);
                sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if (email.equals(sqlEmail) && passw.equals(sqlPwd) && sqluserType.equals("Admin")) {
                JOptionPane.showMessageDialog(f,"hello admin");
            }
            else{
                JOptionPane.showMessageDialog(f,"Invalid User I'D or Password");
            }
        }
    });

    b2 = new JButton("SIGN UP");
    b2.setBounds(370,300,100,30);
    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f.dispose();
            JFrame s = new JFrame("SIGN IN PAGE");
            JLabel l1,l2,l3,l4,l5;
            JTextField tf1,tf2,tf3;
            JButton b1;
            JPasswordField p1,p2;
            JComboBox cb1;

            String [] usertype = {"User","Admin"};
        
            cb1 = new JComboBox(usertype);
            cb1.setBounds(80, 50, 0100, 30);

            l1 = new JLabel("NAME");
            l1.setBounds(80,100,100,30);

            l2 = new JLabel("MOB NO");
            l2.setBounds(80,200,100,30);

            l3 = new JLabel("EMAIL");
            l3.setBounds(80,300,100,30);

            l4 = new JLabel("CREATE PASSWORD");
            l4.setBounds(80,400,170,30);

            l5 = new JLabel("CONFIRM PASSWORD");
            l5.setBounds(80,500,170,30);

            tf1 = new JTextField();
            tf1.setBounds(250,100,200,30);

            tf2 = new JTextField();
            tf2.setBounds(250,200,200,30);
           
            tf3 = new JTextField();
            tf3.setBounds(250,300,200,30);

            p1 = new JPasswordField();
            p1.setBounds(250,400,200,30);

            p2 = new JPasswordField();
            p2.setBounds(250,500,200,30);

            b1 = new JButton("REGISTER");
            b1.setBounds(150,600,100,30);


            //code for registering into the application (only sql is left for now)
            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String passw1 =new String(p1.getPassword());
                    String passw2 =new String(p2.getPassword());
                    String mob=tf2.getText();
                    String name  = tf1.getText();
                    String email = tf3.getText();
                    String userType = ""+cb1.getItemAt(cb1.getSelectedIndex());
                    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-]+.[a-zA-Z.-]+$";

                    //mobile validity checking
                    int mobValidcount=0;
                    for (int i = 0; i <mob.length() ; i++) {
                            if(mob.charAt(i)=='1' ||mob.charAt(i)=='2' ||mob.charAt(i)=='3' ||mob.charAt(i)=='4' ||mob.charAt(i)=='5' ||mob.charAt(i)=='6' ||mob.charAt(i)=='7' ||mob.charAt(i)=='8' ||mob.charAt(i)=='9' ||mob.charAt(i)=='0'){
                               mobValidcount++;
                            }
                    }
                    if(mob.length()==10){
                        if (mobValidcount != 10) {
                            JOptionPane.showMessageDialog(s,"Mobile number should be a number");
                        }
                    }
                    else{
                         JOptionPane.showMessageDialog(s,"Enter 10 digit mobile number");
                    }
                    //pwd validity checking
                    if(!passw1.equals(passw2)){
                        JOptionPane.showMessageDialog(s,"Password Mismatch");
                    }

                    //name validity checking
                    if (name.length()==0) {
                        JOptionPane.showMessageDialog(s,"Enter your name");
                    }

                    //email validity checking
                    if (email.length()==0) {
                        JOptionPane.showMessageDialog(s,"Enter your email");
                    }
                    if(!email.matches(regex) && email.length()!=0){
                        JOptionPane.showMessageDialog(s,"Invalid email");
                    }
                    

                    //if everything is crct, adding it to the sql and successfully registering
                    if(passw1.equals(passw2) && mobValidcount==10 && (name.length()>=1) && (email.length()>=1 && email.matches(regex))){
                        //here goes sql
                        try {
                            Connection regcn = DriverManager.getConnection(dbUrl, user, pwdd);
                            Statement stmt = null;
                            stmt = regcn.createStatement();

                            String regqry = "insert into user(name,mobno,Email,userType,pwd) values('"+name+"',"+mob+",'"+email+"','"+userType+"','"+passw1+"')";
                            stmt.executeUpdate(regqry);

                            JOptionPane.showMessageDialog(s,"Successfully Registered");

                        } catch (Exception en) {
                            System.out.println(en);
                        }
                        
                    }
                
                    
                    
                }
            
            });
            
            s.add(cb1);
            s.add(l1);s.add(l2);s.add(l3);s.add(l4);s.add(l5);
            s.add(tf1);s.add(tf2);s.add(tf3);s.add(p1);s.add(p2);
            s.add(b1);

            s.setBounds(500,100,500,700);
            s.setLayout(null);
            s.setVisible(true);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
    });

    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(tf1);
    f.add(p1);
    f.add(b1);
    f.add(b2);
    

    
    f.setBounds(500,100,500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    
    }


    
 
    
}


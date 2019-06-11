import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.event.ChangeEvent;
public class Employee extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane_1;
	private JTextField textField;
	private JTextField textField1;
	private JPanel panel1,panel2,panel3;
	JLabel lblTotal;
	private JSpinner spinner,spinner_1,spinner_2,spinner_3,spinner_4,spinner_5,spinner_6,spinner_7,spinner_8,spinner_9,spinner_10,spinner_11,spinner_12;
	private int ex_id,Cid,Oid;
    String cname, caddress,mobile,items; 
    private int[] veg=new int[]{0,0,0,0,0};
   private int[] nonveg=new int[]{0,0,0,0,0};
   private int[] drink=new int[]{0,0,0};
   private int[] vegp=new int[]{30,15,30,40,50};
   private int[] nonvegp=new int[]{100,80,90,150,90};
   private int[] drinkp=new int[]{20,10,10};
   private String[] vegf={"Dosa","2 Idli","Fried Rice","Rice Bath","Roti Curry"};
   private String[] nonvegf={"Chicken Biryani","Chicken Masala","Chilli Chicken","Grill Chicken","Kadai Chicken"};
   private String[] drinkf={"Cold Drink","tea","Cofee"};
    
    

	/**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int total() {
		int price,vegsum=0,nonvegsum=0,drinksum=0;
		items="";
		for(int i=0;i<5;i++) {
			
			if(veg[i]>0) {
			 vegsum+=(veg[i]*vegp[i]);
			 items=items+vegf[i]+":"+Integer.toString(veg[i])+",";
				}
			if(nonveg[i]>0) {
				 nonvegsum+=(nonveg[i]*nonvegp[i]);
				 items=items+nonvegf[i]+":"+Integer.toString(nonveg[i])+",";
					}
		}
		for(int i=0;i<3;i++) {
			if(drink[i]>0) {
				drinksum+=(drink[i]*drinkp[i]);
				 items=items+drinkf[i]+":"+Integer.toString(drink[i])+",";
			}
		}
		price=vegsum+nonvegsum+drinksum;
		

		return price;
	}
	
	private void reset() {
		spinner_1.setValue(0);
			spinner_2.setValue(0);
			spinner_3.setValue(0);
			spinner_4.setValue(0);
			spinner_5.setValue(0);
			spinner_6.setValue(0);
			spinner_7.setValue(0);
			spinner_8.setValue(0);
			spinner_9.setValue(0);
			spinner_10.setValue(0);
			spinner_11.setValue(0);
			spinner_12.setValue(0);
			spinner.setValue(0);
			lblTotal.setText(" ");
			textField_3.setText("");
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
		
	}
	Connection connection=null;
	private JTextField textField2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	
	public void makeConnection() {
		connection=sqlconnection.dbConnector();
	}
	
	public Employee() {
		makeConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 449);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 77, 683, 322);
		contentPane.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
	    panel1 = new JPanel();
	    panel1.setBackground(new Color(204, 255, 204));
		layeredPane_1.add(panel1, "name_40913900990727");
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mobile ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(137, 58, 133, 25);
		panel1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(279, 62, 145, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(181, 106, 88, 20);
		panel1.add(lblNewLabel_2);
		
		textField1 = new JTextField();
		textField1.setBounds(279, 106, 145, 20);
		panel1.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(181, 150, 89, 14);
		panel1.add(lblNewLabel_3);
		
		textField2 = new JTextField();
		textField2.setBounds(279, 149, 145, 20);
		panel1.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Customer Info");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(197, 11, 245, 25);
		panel1.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select ID from customers where mobile=?";
					PreparedStatement pst=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					mobile=textField.getText();
					pst.setString(1, mobile);
					
					cname=textField1.getText();
					caddress=textField2.getText();
										
					ResultSet rs=pst.executeQuery();
					
					
					if(rs.next()) {
						
						ex_id=rs.getInt(1);
						textField.setText("");
						textField1.setText("");
						textField2.setText("");

						JOptionPane.showMessageDialog(null," Customer Exist");
						switchPanels(panel3);
						
					}
					else
					{    query="select ID from customers order by ID desc";
					    pst=connection.prepareStatement(query);
					    ResultSet rs1=pst.executeQuery();
					       if( rs1.next()) {
								 int cid_last=rs1.getInt(1);
							     Cid=cid_last+1;
							     ex_id=Cid;}
					       else {
					    	   Cid=100;
					    	   ex_id=Cid;
					       }
					   query="insert into customers values(?,?,?,?)";
						 pst=connection.prepareStatement(query);
						pst.setInt(1, Cid);
						pst.setString(2, textField1.getText());
						pst.setString(3, textField.getText());
						pst.setString(4, textField2.getText());
						int update=pst.executeUpdate();
						textField.setText("");
						textField1.setText("");
						textField2.setText("");
						JOptionPane.showMessageDialog(null," Customer Added");
						switchPanels(panel3);
						rs1.close();
					}
					
					pst.close();
					rs.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(268, 200, 133, 34);
		panel1.add(btnNewButton_1);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(204, 255, 204));
		layeredPane_1.add(panel2, "name_40916067535629");
		panel2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Order By Order ID : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 22, 273, 24);
		panel2.add(lblNewLabel_1);
		
		JLabel lblViewOrderBy = new JLabel("View Order By Order ID : ");
		lblViewOrderBy.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblViewOrderBy.setBounds(10, 103, 273, 24);
		panel2.add(lblViewOrderBy);
		
		JLabel lblNewLabel_8 = new JLabel("Order Id");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(89, 57, 100, 24);
		panel2.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 61, 86, 20);
		panel2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("Order Id");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(89, 138, 100, 24);
		panel2.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(210, 138, 86, 20);
		panel2.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				int id=Integer.parseInt(textField_1.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						
						query="delete from orders where OID=?";
						pst=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						int update=pst.executeUpdate();
						textField_1.setText("");
						JOptionPane.showMessageDialog(null, "Order Id Deleted");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_1.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnNewButton_2.setBounds(321, 60, 89, 23);
		panel2.add(btnNewButton_2);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_2.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						textField_2.setText("");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_2.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnShow.setBounds(321, 138, 89, 23);
		panel2.add(btnShow);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 184, 606, 112);
		panel2.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel3 = new JPanel();
		layeredPane_1.add(panel3, "name_65661903614924");
		panel3.setBackground(new Color(204, 255, 204));
		panel3.setToolTipText("Veg");
		panel3.setLayout(null);
		
		JLabel lblPlaceOrder = new JLabel("Place Order");
		lblPlaceOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlaceOrder.setBounds(261, 11, 140, 25);
		panel3.add(lblPlaceOrder);
		
		JLabel lblNewLabel_5 = new JLabel("VEG");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(79, 58, 46, 14);
		panel3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NON-VEG");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(310, 58, 91, 14);
		panel3.add(lblNewLabel_6);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrinks.setBounds(540, 58, 51, 14);
		panel3.add(lblDrinks);
		
		JLabel lblNewLabel_7 = new JLabel("Dosa");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setBounds(20, 81, 79, 19);
		panel3.add(lblNewLabel_7);
		
		JLabel lblIdli = new JLabel("2 Idli");
		lblIdli.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdli.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdli.setBounds(20, 107, 79, 19);
		panel3.add(lblIdli);
		
		JLabel lblFriedRice = new JLabel("Fried Rice");
		lblFriedRice.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFriedRice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFriedRice.setBounds(20, 134, 79, 19);
		panel3.add(lblFriedRice);
		
		JLabel lblRiceBath = new JLabel("Rice Bath");
		lblRiceBath.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRiceBath.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRiceBath.setBounds(20, 161, 79, 19);
		panel3.add(lblRiceBath);
		
		JLabel lblRotiCurry = new JLabel("Roti Curry");
		lblRotiCurry.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRotiCurry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRotiCurry.setBounds(20, 185, 79, 19);
		panel3.add(lblRotiCurry);
		
		JLabel lblChickenBiryani = new JLabel("Chicken Biryani");
		lblChickenBiryani.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChickenBiryani.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBiryani.setBounds(230, 83, 124, 19);
		panel3.add(lblChickenBiryani);
		
		JLabel lblChickenBiryani_1 = new JLabel("Chicken Masala");
		lblChickenBiryani_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChickenBiryani_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBiryani_1.setBounds(230, 107, 124, 19);
		panel3.add(lblChickenBiryani_1);
		
		JLabel lblChickenBiryani_2 = new JLabel("Chilli Chicken");
		lblChickenBiryani_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChickenBiryani_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBiryani_2.setBounds(230, 134, 124, 19);
		panel3.add(lblChickenBiryani_2);
		
		JLabel lblChickenBiryani_3 = new JLabel("Grilled Chicken");
		lblChickenBiryani_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChickenBiryani_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBiryani_3.setBounds(230, 161, 124, 19);
		panel3.add(lblChickenBiryani_3);
		
		JLabel lblChickenBiryani_4 = new JLabel("Chicken kadai");
		lblChickenBiryani_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChickenBiryani_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBiryani_4.setBounds(230, 185, 124, 19);
		panel3.add(lblChickenBiryani_4);
		
		JLabel lblColdDrink = new JLabel("Cold Drink");
		lblColdDrink.setHorizontalAlignment(SwingConstants.TRAILING);
		lblColdDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblColdDrink.setBounds(486, 84, 79, 19);
		panel3.add(lblColdDrink);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTea.setBounds(486, 110, 79, 19);
		panel3.add(lblTea);
		
		JLabel lblCoffee = new JLabel("Coffee");
		lblCoffee.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCoffee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoffee.setBounds(486, 137, 79, 19);
		panel3.add(lblCoffee);
		
		 spinner = new JSpinner();
		 spinner.addChangeListener(new ChangeListener() {
		 	public void stateChanged(ChangeEvent e) {
		 		veg[0]=(int)spinner.getValue();
		 	}
		 });
		 spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		 spinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		 spinner.setBounds(109, 80, 40, 20);
		 panel3.add(spinner);
		 
		  spinner_1 = new JSpinner();
		  spinner_1.addChangeListener(new ChangeListener() {
		  	public void stateChanged(ChangeEvent e) {
		  		veg[1]=(int)spinner_1.getValue();
		  	}
		  });
		  spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		  spinner_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		  spinner_1.setBounds(109, 106, 40, 20);
		  panel3.add(spinner_1);
		  
		   spinner_2 = new JSpinner();
		   spinner_2.addChangeListener(new ChangeListener() {
		   	public void stateChanged(ChangeEvent e) {
		   		veg[2]=(int)spinner_2.getValue();
		   	}
		   });
		   spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		   spinner_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		   spinner_2.setBounds(109, 133, 40, 20);
		   panel3.add(spinner_2);
		   
		    spinner_3 = new JSpinner();
		    spinner_3.addChangeListener(new ChangeListener() {
		    	public void stateChanged(ChangeEvent e) {
		    		veg[3]=(int)spinner_3.getValue();
		    	}
		    });
		    spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		    spinner_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		    spinner_3.setBounds(109, 160, 40, 20);
		    panel3.add(spinner_3);
		    
		     spinner_4 = new JSpinner();
		     spinner_4.addChangeListener(new ChangeListener() {
		     	public void stateChanged(ChangeEvent e) {
		     		veg[4]=(int)spinner_4.getValue();
		     	}
		     });
		     spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		     spinner_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		     spinner_4.setBounds(109, 184, 40, 20);
		     panel3.add(spinner_4);
		     
		      spinner_5 = new JSpinner();
		      spinner_5.addChangeListener(new ChangeListener() {
		      	public void stateChanged(ChangeEvent e) {
		      		nonveg[0]=(int)spinner_5.getValue();
		      	}
		      });
		      spinner_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		      spinner_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		      spinner_5.setBounds(382, 83, 40, 20);
		      panel3.add(spinner_5);
		      
		       spinner_6 = new JSpinner();
		       spinner_6.addChangeListener(new ChangeListener() {
		       	public void stateChanged(ChangeEvent e) {
		       		nonveg[1]=(int)spinner_6.getValue();
		       	}
		       });
		       spinner_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		       spinner_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		       spinner_6.setBounds(382, 106, 40, 20);
		       panel3.add(spinner_6);
		       
		        spinner_7 = new JSpinner();
		        spinner_7.addChangeListener(new ChangeListener() {
		        	public void stateChanged(ChangeEvent e) {
		        		nonveg[2]=(int)spinner_7.getValue();
		        	}
		        });
		        spinner_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		        spinner_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		        spinner_7.setBounds(382, 134, 40, 20);
		        panel3.add(spinner_7);
		        
		         spinner_8 = new JSpinner();
		         spinner_8.addChangeListener(new ChangeListener() {
		         	public void stateChanged(ChangeEvent e) {
		         		nonveg[3]=(int)spinner_8.getValue();
		         	}
		         });
		         spinner_8.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		         spinner_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		         spinner_8.setBounds(382, 161, 40, 20);
		         panel3.add(spinner_8);
		         
		          spinner_9 = new JSpinner();
		          spinner_9.addChangeListener(new ChangeListener() {
		          	public void stateChanged(ChangeEvent e) {
		          		nonveg[4]=(int)spinner_9.getValue();
		          	}
		          });
		          spinner_9.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		          spinner_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		          spinner_9.setBounds(382, 185, 40, 20);
		          panel3.add(spinner_9);
		          
		           spinner_10 = new JSpinner();
		           spinner_10.addChangeListener(new ChangeListener() {
		           	public void stateChanged(ChangeEvent e) {
		           		drink[0]=(int)spinner_10.getValue();
		           	}
		           });
		           spinner_10.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		           spinner_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		           spinner_10.setBounds(585, 83, 40, 20);
		           panel3.add(spinner_10);
		           
		            spinner_11 = new JSpinner();
		            spinner_11.addChangeListener(new ChangeListener() {
		            	public void stateChanged(ChangeEvent e) {
		            		drink[1]=(int)spinner_11.getValue();
		            	}
		            });
		            spinner_11.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		            spinner_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		            spinner_11.setBounds(585, 107, 40, 20);
		            panel3.add(spinner_11);
		            
		             spinner_12 = new JSpinner();
		             spinner_12.addChangeListener(new ChangeListener() {
		             	public void stateChanged(ChangeEvent e) {
		             		drink[2]=(int)spinner_12.getValue();
		             	}
		             });
		             spinner_12.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		             spinner_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		             spinner_12.setBounds(585, 134, 40, 20);
		             panel3.add(spinner_12);
		             
		             JButton btnTotal = new JButton("Total");
		             btnTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		             btnTotal.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             	
		             		lblTotal.setText("Total : "+total());

		             	}
		             });
		             btnTotal.setBounds(395, 276, 91, 35);
		             panel3.add(btnTotal);
		             
		             JButton btnPlaceOrder = new JButton("Place Order");
		             btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 16));
		             btnPlaceOrder.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		try {
		             				             		   
		             			 int eid=Integer.parseInt(textField_3.getText());
		             			String query="select EID from employee where EID=?";
		             			PreparedStatement pst=connection.prepareStatement(query);
		             			    pst.setInt(1,eid);
		             			    ResultSet rs1=pst.executeQuery();
		             			if(rs1.next()) {				
		             		    query="select OID from orders order by OID desc";
		             			 pst=connection.prepareStatement(query);
		             			     rs1=pst.executeQuery();
		             			       if( rs1.next()) {
		             						 int oid_last=rs1.getInt(1);
		             					     Oid=oid_last+1;
		             					     }
		             			       else {
		             			    	   Oid=1;}
		             			      query="insert into orders values(?,?,?,?,?)";
			             				 pst=connection.prepareStatement(query);
			             				pst.setInt(1, Oid);
			             				pst.setInt(2, ex_id);
			             				pst.setInt(3, eid);
			             				pst.setInt(4, total());
			             				pst.setString(5, items);
			             				int update=pst.executeUpdate();
		             			      
		  		             		
				             		  
				             		for(int i=0;i<5;i++) {
				             			
				             			if(veg[i]>0) {			             			
				             			query="select ItemId from menu where ItemName=?";
				             			pst=connection.prepareStatement(query);
				             			pst.setString(1,vegf[i]);
				             			rs1=pst.executeQuery();
				             			rs1.next();
				             			int itemId=rs1.getInt(1);
				             			query="insert into ordereditems(OrderID,ItemId,NoOfItems) values(?,?,?)";
			             				 pst=connection.prepareStatement(query);
			             				pst.setInt(1, Oid);
			             				pst.setInt(2, itemId);
			             				pst.setInt(3, veg[i]);
			             				update=pst.executeUpdate();
				             			  veg[i]=0;
				             				}
				             			if(nonveg[i]>0) {			             				 
				             				 
				             				query="select ItemId from menu where ItemName=?";
					             			pst=connection.prepareStatement(query);
					             			pst.setString(1,nonvegf[i]);
					             			rs1=pst.executeQuery();
					             			rs1.next();
					             			int itemId=rs1.getInt(1);
					             			query="insert into ordereditems(OrderID,ItemId,NoOfItems) values(?,?,?)";
				             				 pst=connection.prepareStatement(query);
				             				pst.setInt(1, Oid);
				             				pst.setInt(2, itemId);
				             				pst.setInt(3, nonveg[i]);
				             			    update=pst.executeUpdate();
				             			      nonveg[i]=0;
				             			      }
				             		}
				             		for(int i=0;i<3;i++) {
				             			if(drink[i]>0) {		 
				             				
				             				query="select ItemId from menu where ItemName=?";
					             			pst=connection.prepareStatement(query);
					             			pst.setString(1,drinkf[i]);
					             			rs1=pst.executeQuery();
					             			rs1.next();
					             			int itemId=rs1.getInt(1);
					             			query="insert into ordereditems(OrderID,ItemId,NoOfItems) values(?,?,?)";
				             				 pst=connection.prepareStatement(query);
				             				pst.setInt(1, Oid);
				             				pst.setInt(2, itemId);
				             				pst.setInt(3, drink[i]);
				             				update=pst.executeUpdate();
				             				 drink[i]=0;
				             			}
				             		}
				             		            			        
		             			  
		             				reset();
		             				
		             				
		             				JOptionPane.showMessageDialog(null," Order Placed with ID : "+Oid);
		             				switchPanels(panel1);
		             				rs1.close();
		             			
		             			
		             			pst.close();
		             			rs1.close();
		             		}
		             		else {
		             			JOptionPane.showMessageDialog(null,"Emp Id Not Exist");
		             		}
		             		}
		             		catch(Exception ex) {
		             			JOptionPane.showMessageDialog(null, ex);
		             		}
		             		
		             	}
		             });
		             btnPlaceOrder.setBounds(511, 276, 144, 35);
		             panel3.add(btnPlaceOrder);
		             
		              lblTotal = new JLabel("Total:");
		              lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		              lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		              lblTotal.setBounds(282, 229, 140, 25);
		              panel3.add(lblTotal);
		              
		              JButton btnReset = new JButton("Reset");
		              btnReset.addActionListener(new ActionListener() {
		              	public void actionPerformed(ActionEvent e) {
		              		reset();
		              	}
		              });
		              btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		              btnReset.setBounds(282, 276, 91, 35);
		              panel3.add(btnReset);
		              
		              JLabel lblEid = new JLabel("EID");
		              lblEid.setHorizontalAlignment(SwingConstants.TRAILING);
		              lblEid.setFont(new Font("Tahoma", Font.BOLD, 16));
		              lblEid.setBounds(460, 229, 69, 25);
		              panel3.add(lblEid);
		              
		              textField_3 = new JTextField();
		              textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		              textField_3.setBounds(540, 231, 86, 20);
		              panel3.add(textField_3);
		              textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Take Order");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel1);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
			}
		});
		btnNewButton.setBounds(10, 22, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton btnViewOrder = new JButton("Manage Orders");
		btnViewOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(panel2);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
			}
		});
		btnViewOrder.setBounds(165, 22, 161, 23);
		contentPane.add(btnViewOrder);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				contentPane.setVisible(false);
				dispose();
				MainPage.main(null);
			}
		});
		btnBack.setBounds(389, 22, 111, 23);
		contentPane.add(btnBack);
		
		
	}
}

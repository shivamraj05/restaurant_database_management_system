import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panel,panel1,panel2;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblName;
	private JLabel lblAge;
	private JLabel lblSalary;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void switchPanel(JPanel panel) {
			layeredPane.removeAll();
			layeredPane.add(panel);
			layeredPane.repaint();
			layeredPane.revalidate();
			
		}
	Connection connection1=null;
	private JTextField textField_4;
	private JLabel lblSex;
	private JLabel lblNewLabel_1;
	private JTextField textField_5;
	private JButton btnNewButton_2;
	private JButton btnDelete;
	private JLabel lblViewAllEmployee;
	private JButton btnShow;
	private JTable table1;
	private JScrollPane scrollPane;
	private JButton btnManageOrders;
	private JLabel lblOid;
	private JTextField textField_6;
	private JButton button;
	private JButton button_1;
	private JLabel lblViewAllOrders;
	private JButton button_2;
	private JTable table2;
	private JScrollPane scrollPane_1;
	private JPanel panel3;
	private JButton btnManageCustomer;
	private JLabel lblCid;
	private JTextField textField_7;
	private JButton button_3;
	private JButton btnDelete_1;
	private JLabel lblViewAllCustomers;
	private JButton button_4;
	private JTable table3;
	private JScrollPane scrollPane_2;
	private JButton btnOrders;
	private JButton btnCustomer;
	private JButton btnOrders_1;
	private JPanel panel4;
	private JButton btnOrderedItems;
	private JTable table4;
	private JScrollPane scrollPane_3;
	private JLabel lblOrderId;
	private JTextField textField_8;
	private JButton btnViewItems;
	private JLabel lblItemId;
	private JTextField textField_9;
	private JButton btnViewOrders;
	private JLabel lblViewAllOrdered;
	private JButton btnViewOrderedItems;
	public void Connect() {
		connection1=sqlconnection.dbConnector();
	}
	public Admin() {
		Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 85, 676, 359);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		 panel = new JPanel();
		 panel.setBackground(new Color(255, 204, 0));
		layeredPane.add(panel, "name_86636148442599");
		panel.setLayout(null);
		
		JLabel lblEmployeeInfo = new JLabel("Employee Info");
		lblEmployeeInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmployeeInfo.setBounds(253, 11, 156, 29);
		panel.add(lblEmployeeInfo);
		
		lblNewLabel = new JLabel("EID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(220, 78, 54, 17);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(303, 72, 139, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(220, 118, 54, 17);
		panel.add(lblName);
		
		lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(220, 158, 54, 17);
		panel.add(lblAge);
		
		lblSalary = new JLabel("Salary");
		lblSalary.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSalary.setBounds(201, 238, 73, 17);
		panel.add(lblSalary);
		
		lblSex = new JLabel("Sex");
		lblSex.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSex.setBounds(220, 198, 54, 17);
		panel.add(lblSex);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(303, 112, 139, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(303, 152, 139, 29);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(303, 232, 139, 29);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(303, 192, 139, 29);
		panel.add(textField_4);
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						
             		String  query="insert into employee values(?,?,?,?,?)";
             			PreparedStatement pst=connection1.prepareStatement(query);
             			    int eid=Integer.parseInt(textField.getText());
             			   int age=Integer.parseInt(textField_2.getText());
             			  int salary=Integer.parseInt(textField_3.getText());
             			  
             				pst.setInt(1, eid);
             				pst.setString(2, textField_1.getText());
             				pst.setInt(3, age);
             				pst.setString(4, textField_4.getText());
             				pst.setInt(5, salary);
             				
             				int update=pst.executeUpdate();
             				             				
             				JOptionPane.showMessageDialog(null," Employee Added");
             				textField.setText("");
             				textField_1.setText("");
             				textField_2.setText("");
             				textField_3.setText("");
             				textField_4.setText("");
             				pst.close();
             			
             		}
             		catch(Exception ex) {
             			JOptionPane.showMessageDialog(null, ex);
             		}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(278, 289, 119, 36);
		panel.add(btnNewButton_1);
		
		 panel1 = new JPanel();
		 panel1.setBackground(new Color(255, 204, 0));
		layeredPane.add(panel1, "name_86648098748527");
		panel1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("EID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(48, 26, 58, 20);
		panel1.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(134, 26, 86, 20);
		panel1.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_5.getText());
				try {
					String query="select * from employee where EID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table1.setModel(DbUtils.resultSetToTableModel(rs));
						textField_5.setText("");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Employee Id Does Not Exist");
						textField_5.setText("");
						DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
						model1.setRowCount(0);
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(266, 25, 109, 23);
		panel1.add(btnNewButton_2);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				int id=Integer.parseInt(textField_5.getText());
				try {
					String query="select * from employee where EID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						
						query="delete from employee where EID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						int update=pst.executeUpdate();
						textField_5.setText("");
						JOptionPane.showMessageDialog(null, "Emp Id Deleted");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Emp Id Does Not Exist");
						textField_5.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(397, 25, 109, 23);
		panel1.add(btnDelete);
		
		lblViewAllEmployee = new JLabel("View All Employee");
		lblViewAllEmployee.setHorizontalAlignment(SwingConstants.TRAILING);
		lblViewAllEmployee.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewAllEmployee.setBounds(58, 90, 172, 20);
		panel1.add(lblViewAllEmployee);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select * from employee";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table1.setModel(DbUtils.resultSetToTableModel(rs));
												
					}
					else {
						JOptionPane.showMessageDialog(null, "NO Employee");
						 switchPanel(panel);
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnShow.setBounds(266, 89, 109, 23);
		panel1.add(btnShow);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 154, 578, 183);
		panel1.add(scrollPane);
		
		table1 = new JTable();
		scrollPane.setViewportView(table1);
		
		btnOrders_1 = new JButton("Orders");
		btnOrders_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_5.getText());
				try {
					String query="select * from employee where EID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						query="select o.EID,Name,OID,Items from employee e,orders o where e.EID=o.EID and o.EID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						rs=pst.executeQuery();
						if(rs.next()) {
						rs=pst.executeQuery();
						table1.setModel(DbUtils.resultSetToTableModel(rs));
						textField_5.setText("");
						}
						else {
							JOptionPane.showMessageDialog(null, "Employee has no orders");
							textField_5.setText("");
							
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Employee Id Does Not Exist");
						textField_5.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnOrders_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOrders_1.setBounds(534, 25, 109, 23);
		panel1.add(btnOrders_1);
		
		 panel2 = new JPanel();
		 panel2.setBackground(new Color(255, 204, 0));
		layeredPane.add(panel2, "name_86670251140787");
		panel2.setLayout(null);
		
		lblOid = new JLabel("OID");
		lblOid.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOid.setBounds(43, 26, 58, 20);
		panel2.add(lblOid);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(133, 26, 86, 20);
		panel2.add(textField_6);
		
		button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_6.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table2.setModel(DbUtils.resultSetToTableModel(rs));
						textField_6.setText("");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_6.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBounds(245, 25, 109, 23);
		panel2.add(button);
		
		button_1 = new JButton("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table2.getModel();
				model.setRowCount(0);
				int id=Integer.parseInt(textField_6.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						
						query="delete from orders where OID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						int update=pst.executeUpdate();
						textField_6.setText("");
						JOptionPane.showMessageDialog(null, "Order Id Deleted");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_6.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(377, 25, 109, 23);
		panel2.add(button_1);
		
		lblViewAllOrders = new JLabel("View All Orders");
		lblViewAllOrders.setHorizontalAlignment(SwingConstants.TRAILING);
		lblViewAllOrders.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewAllOrders.setBounds(66, 91, 172, 20);
		panel2.add(lblViewAllOrders);
		
		button_2 = new JButton("Show");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select * from orders ";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table2.setModel(DbUtils.resultSetToTableModel(rs));
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "No orders");
						
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBounds(285, 90, 109, 23);
		panel2.add(button_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 142, 632, 194);
		panel2.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setViewportView(table2);
		
		btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_6.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						query="select OID,CID,Name,Mobile,Address from customers c,orders o where c.ID=o.CID and o.OID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						rs=pst.executeQuery();
						table2.setModel(DbUtils.resultSetToTableModel(rs));
						textField_6.setText("");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_6.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCustomer.setBounds(507, 26, 129, 23);
		panel2.add(btnCustomer);
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(255, 204, 0));
		layeredPane.add(panel3, "name_123944751508648");
		panel3.setLayout(null);
		
		lblCid = new JLabel("CID");
		lblCid.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCid.setBounds(50, 27, 58, 20);
		panel3.add(lblCid);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(129, 27, 86, 20);
		panel3.add(textField_7);
		
		button_3 = new JButton("Search");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_7.getText());
				try {
					String query="select * from customers where ID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table3.setModel(DbUtils.resultSetToTableModel(rs));
						textField_7.setText("");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Customer Id Does Not Exist");
						textField_7.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBounds(248, 26, 109, 23);
		panel3.add(button_3);
		
		btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table3.getModel();
				model.setRowCount(0);
				int id=Integer.parseInt(textField_7.getText());
				try {
					String query="select * from customers where ID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						
						query="delete from customers where ID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						int update=pst.executeUpdate();
						textField_7.setText("");
						JOptionPane.showMessageDialog(null, "Customer Removed");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Customer Id Does Not Exist");
						textField_7.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnDelete_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete_1.setBounds(382, 26, 109, 23);
		panel3.add(btnDelete_1);
		
		lblViewAllCustomers = new JLabel("View All Customers");
		lblViewAllCustomers.setHorizontalAlignment(SwingConstants.TRAILING);
		lblViewAllCustomers.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewAllCustomers.setBounds(50, 95, 201, 20);
		panel3.add(lblViewAllCustomers);
		
		button_4 = new JButton("Show");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select * from customers ";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table3.setModel(DbUtils.resultSetToTableModel(rs));
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "No Customer");
						
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBounds(290, 92, 109, 23);
		panel3.add(button_4);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(23, 143, 628, 205);
		panel3.add(scrollPane_2);
		
		table3 = new JTable();
		scrollPane_2.setViewportView(table3);
		
		btnOrders = new JButton("Orders");
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_7.getText());
				try {
					String query="select * from customers where ID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						query="select ID,Name,OID,Price,Items from customers c,orders o where c.ID=o.CID and o.CID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						rs=pst.executeQuery();
						if(rs.next()) {
							rs=pst.executeQuery();
						table3.setModel(DbUtils.resultSetToTableModel(rs));
						textField_7.setText("");
						}
						else {
							JOptionPane.showMessageDialog(null, "Customer has no orders");
							textField_7.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Customer Id Does Not Exist");
						textField_7.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnOrders.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOrders.setBounds(513, 26, 109, 23);
		panel3.add(btnOrders);
		
		panel4 = new JPanel();
		panel4.setBackground(new Color(255, 204, 0));
		layeredPane.add(panel4, "name_155793010381273");
		panel4.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(78, 166, 357, 182);
		panel4.add(scrollPane_3);
		
		table4 = new JTable();
		scrollPane_3.setViewportView(table4);
		
		lblOrderId = new JLabel("Order ID");
		lblOrderId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOrderId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOrderId.setBounds(44, 21, 90, 20);
		panel4.add(lblOrderId);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(155, 21, 86, 20);
		panel4.add(textField_8);
		
		btnViewItems = new JButton("View Items");
		btnViewItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_8.getText());
				try {
					String query="select * from orders where OID=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						query="select m.ItemId,m.ItemName,o.NoOfItems as Number from menu m,ordereditems o where m.ItemId=o.ItemId and o.OrderID=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						rs=pst.executeQuery();
						if(rs.next()) {
							rs=pst.executeQuery();
						table4.setModel(DbUtils.resultSetToTableModel(rs));
						textField_8.setText("");
						}
						else {
							JOptionPane.showMessageDialog(null, "Something Wrong");
							textField_8.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Order Id Does Not Exist");
						textField_8.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnViewItems.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnViewItems.setBounds(270, 20, 139, 23);
		panel4.add(btnViewItems);
		
		lblItemId = new JLabel("Item ID");
		lblItemId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblItemId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemId.setBounds(44, 68, 90, 20);
		panel4.add(lblItemId);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(155, 68, 86, 20);
		panel4.add(textField_9);
		
		btnViewOrders = new JButton("View Orders");
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_9.getText());
				try {
					String query="select * from menu where ItemId=?";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					pst.setInt(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						query="select o.OrderId,o.NoOfItems as Number from ordereditems o where o.ItemId=?";
						pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
						pst.setInt(1, id);
						rs=pst.executeQuery();
						if(rs.next()) {
							rs=pst.executeQuery();
						table4.setModel(DbUtils.resultSetToTableModel(rs));
						textField_9.setText("");
						}
						else {
							JOptionPane.showMessageDialog(null, "Item is not in any order");
							textField_9.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "ItemId Id Does Not Exist");
						textField_9.setText("");
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnViewOrders.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnViewOrders.setBounds(270, 65, 139, 23);
		panel4.add(btnViewOrders);
		
		lblViewAllOrdered = new JLabel("View All Ordered Items");
		lblViewAllOrdered.setHorizontalAlignment(SwingConstants.TRAILING);
		lblViewAllOrdered.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewAllOrdered.setBounds(25, 112, 216, 20);
		panel4.add(lblViewAllOrdered);
		
		btnViewOrderedItems = new JButton("View Ordered Items");
		btnViewOrderedItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select o.OrderID,o.ItemId,m.ItemName,o.NoOfItems as Number from menu m,ordereditems o where m.itemId=o.ItemId ";
					PreparedStatement pst=connection1.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE);
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						rs=pst.executeQuery();
						table4.setModel(DbUtils.resultSetToTableModel(rs));
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "No Orders");
						
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		btnViewOrderedItems.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnViewOrderedItems.setBounds(270, 111, 205, 23);
		panel4.add(btnViewOrderedItems);
		
		JButton btnNewButton = new JButton("Insert Emp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel);
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(28, 11, 117, 23);
		contentPane.add(btnNewButton);
		
		JButton btnManageEmp = new JButton("Manage Emp");
		btnManageEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel1);
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
			}
		});
		btnManageEmp.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnManageEmp.setBounds(177, 11, 134, 23);
		contentPane.add(btnManageEmp);
		
		btnManageOrders = new JButton("Manage Orders");
		btnManageOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel2);
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
			}
		});
		btnManageOrders.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnManageOrders.setBounds(343, 11, 160, 23);
		contentPane.add(btnManageOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
				contentPane.setVisible(false);
				dispose();
				MainPage.main(null);
				
			}
		});
		btnBack.setBounds(531, 11, 89, 23);
		contentPane.add(btnBack);
		
		btnManageCustomer = new JButton("Manage Customer");
		btnManageCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel3);
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
			}
		});
		btnManageCustomer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnManageCustomer.setBounds(88, 51, 160, 23);
		contentPane.add(btnManageCustomer);
		
		btnOrderedItems = new JButton("Ordered Items");
		btnOrderedItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel4);
				DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
				model1.setRowCount(0);
				DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
				model2.setRowCount(0);
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.setRowCount(0);
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.setRowCount(0);
			}
		});
		btnOrderedItems.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOrderedItems.setBounds(429, 51, 160, 23);
		contentPane.add(btnOrderedItems);
	}
}

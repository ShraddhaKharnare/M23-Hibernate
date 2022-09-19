package com.gm.client1;

import com.cg.entities1.Admin;
import com.cg.entities1.Customer;
import com.cg.entities1.Employee;
import com.cg.entities1.Order;
import com.cg.entities1.Shop;
import com.cg.entities1.User;
import com.cg.serivice1.ICustomerService;
import com.cg.serivice1.ICustomerServiceImpl;
import com.cg.serivice1.IEmployeeService;
import com.cg.serivice1.IEmployeeServiceImpl;
import com.cg.serivice1.IOrderService;
import com.cg.serivice1.IOrderServiceImpl;
import com.cg.serivice1.IShopService;
import com.cg.serivice1.IShopServiceImpl;
import com.cg.serivice1.IUserService;
import com.cg.serivice1.IUserServiceImpl;

public class Client
{
	public static void main(String[] args)
	{
		User user = new User();
		IUserService service = new IUserServiceImpl();
		user.setUser_Id(111);
		user.setName("hariom");
		user.setType("System User");
		user.setPassword("1234");
		
		Admin admin = new Admin();
		admin.setAdmin_id(12);
		admin.setName("Devyani");
		admin.setPassword("4444");
		admin.setPhone("216835284");
		
		user.setAdmin(admin);
		admin.setUser(user);
		
		service.addNewUser(user);
		
		Shop shop= new Shop();
		IShopService shopService = new IShopServiceImpl();
		shop.setShop_Id(12);
		shop.setShopCategory("Grocery");
		shop.setShopname("Ambika");
		shop.setShopstatus("Too Good");
		shop.setLeaseStatus("100");
		
		Employee employee = new Employee();
		IEmployeeService employeeService = new IEmployeeServiceImpl();
		employee.setEmp_id(1);
		employee.setName("Gaurav");
		employee.setLocalDate(12);
		employee.setSalary(30000);
		employee.setDesignation("Manager");
		
	    employeeService.updateEmployee(employee);
		shopService.updateShop(shop);
		
		System.out.println("Data Is Inserted");
		System.out.println("");
		
		Customer customer= new Customer();
		ICustomerService customerService = new ICustomerServiceImpl();
		customer.setCust_id(65);
		customer.setCust_name("Gaurav Patil");
		customer.setPhone("9826713405");
		customer.setEmail("ajay988@gmail.com");
		
		Order order = new Order();
		IOrderService orderService = new IOrderServiceImpl();
		order.setOrder_id(7985623);
		order.setTotal(10500.02f);
		order.setLdt(null);
		order.setPaymentMode("Online");
		
		orderService.updateOrder(order);
		customerService.updateCustomer(customer);
		
		System.out.println("Data Is Updated");

	}

}

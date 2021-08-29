package com.ljh.test.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/26
 **/
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean , DisposableBean {

	private String name;
	private String address;
	private int phone;

	private BeanFactory beanFactory;
	private String beanName;


	public Person() {
		System.out.println("调用Person的构造器实例化");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("注入属性name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("注入属性address");
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		System.out.println("注入属性phone");
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", phone=" + phone +
				", beanFactory=" + beanFactory +
				", beanName='" + beanName + '\'' +
				'}';
	}

	/**
	 * BeanFactoryAware的接口发放
	 *
	 * @param beanFactory owning BeanFactory (never {@code null}).
	 *                    The bean can immediately call methods on the factory.
	 * @throws BeansException
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactoryAware.setBeanFactory()");
		this.beanFactory = beanFactory;
	}


	/**
	 * BeanNameAware的接口方法
	 * @param name the name of the bean in the factory.
	 * Note that this name is the actual bean name used in the factory, which may
	 * differ from the originally specified name: in particular for inner bean
	 * names, the actual bean name might have been made unique through appending
	 * "#..." suffixes. Use the {@link BeanFactoryUtils#originalBeanName(String)}
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("调用BeanNameAware.setBeanName()");
		this.beanName = name;
	}


	/**
	 * InitializingBean的接口方法
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean.afterPropertiesSet()");
	}

	/**
	 * DisposableBean的接口发方法
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destroy()");
	}
}

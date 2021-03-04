package com.jsoft;



class Exat{

		Exat(){
			System.out.println("hi");
		}
	}
	class Com extends Exat{
		Com(){
			System.out.println("by");
			
		}
	}
	class Good{
		public static void main(String[] args) {
			Exat e=new Com(); 
		}
	}
package com.exercise24assertions.app;
import java.util.Scanner;


public class AssertionsApp 
{

	public static void main(String[] args) 
	{
		int edad=0;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Eres un mayor de edad? introduce tu edad: ");
		edad=input.nextInt();
		
		
		assert edad>0:"Edad no valida";
		
		if(edad<18)
		{
			System.out.println("Menor de edad ");
		}
		
		if(edad>=18)
		{
			System.out.println("Chavorruco ");
		}
	}

}

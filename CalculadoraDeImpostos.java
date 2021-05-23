import java.util.Scanner;

public class CalculadoraDeImpostos {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int opcao, zona, VouF, estabelecimento, area, area2, consultas=0;
		float  valor;
		 double calculo=0, calculo2=0, calculo3=0, porcentagem=0;
		
		
		do //Enquanto Switch for diferente de 9 repete o processo
		{
		  System.out.println("\nSe deseja calcular o IPTU, informe 1;\nSe deseja calcular o ITBI, informe 2; \nSe deseja calcular o Alvar� de Funcionamento, informe 2;\nSe deseja encerrar a consulta informe 9.");
		  opcao = ler.nextInt();   
		  
		  switch (opcao)  //switch com a variavel opcao 
		  {
		  case 1:
			  consultas++; //sempre que uma das op��es for selecionada adiciona +1 para a variavel consulta
			  
			  System.out.println("\nJ� que deseja calcular o IPTU, informe os seguintes itens: ");
			  System.out.println("\nInforme 1 caso resida em zona rural ou 2 caso resida em �rea urbana: ");
			  zona = ler.nextInt();
			  System.out.println("\n Informe a �rea em metros quadrados de seu terreno: ");
			  area = ler.nextInt();
			                       
			  if(zona == 1) 
			  {
				  if(area <= 1000) 
				  {
					  calculo = area * 0.05; //<- calculo do imposto a se pagar 
				  }
				  else if(area >= 1000)   // <<== Todos os valores foram retirados de uma tabela ficticia
				  {                               
					  calculo = area * 0.10;
				  }
			  }
			  else if(zona ==2) 
			  {
				  if(area <=100) 
				  {
					  calculo = area * 0.07;
				  }
				  else if(area > 100 & area <=180) 
				  {
					  calculo = area * 0.12;
				  }
				  else if(area > 180) 
				  {
					  calculo = area * 0.25;
				  }
			  }else 
			  {
				  System.out.println("\nInforme uma op��o v�lida");
			  }
			  System.out.println("O total de impostos a se pagar � de R$" + calculo + "\n");
			 
			  break;
			  
		    case 2:
			   consultas++;
			  
			  System.out.println("\nJ� que deseja calculat o ITBI solicite os seguintes dados!");
			  System.out.println("\nInforme 1 caso a transferencia seja entre vivos ou 2 caso seja entre falecidos: ");
			  VouF = ler.nextInt();
			  System.out.println("\n Informe o valor em reais da negocia��o: ");
			  valor = ler.nextFloat();
			  
			  if(VouF == 1) 
			  {
				  porcentagem = valor * 0.025;
				  calculo2 = valor + porcentagem;
				  System.out.println("O total de impostos a ser pago � de: R$" + calculo2);
			  }
			  else if(VouF == 2)
			  {
				 if(valor < 100000)
				 {
					 System.out.println("Isento de taxas!!");
				 }
				 else if(valor > 100000) 
				 {
					 porcentagem = valor * 0.01;
					 calculo2 = valor + porcentagem;
					 System.out.println("O total de impostos a ser pago � de: R$" + calculo2);
				 }
			  }
			  else
			  {
				  System.out.println("Informe um valor v�lido!!");
			  }
			 
			  
			  break;
			  
			  case 3: 
		      consultas++;
		      
		      System.out.println("J� que deseja calcular o alvar� de funcionamento, informe as seguintes op��es: ");
		      System.out.println("Digite 1 caso o estabelecimento seja uma igreja: ");
		      System.out.println("Digite 2 caso o estabelecimento seja um com�rcio ou servi�o: ");
		      System.out.println("Digite 3 caso o estabelecimento seja uma industria: ");
		      estabelecimento=ler.nextInt();
		      System.out.println("Informe a �rea em metros quadrados do estabelecimento: ");
		      area2=ler.nextInt();
		      
		      if(estabelecimento==1)
		      {
		    	  if(area2 <= 2000) 
		    	  {
		    		  System.out.println("Isento de impostos!!");
		    	  }
		    	  else if(area2 > 2000) 
		    	  {
		    		  System.out.println("O total a se pagar � de R$150");
		    	  }
		      }
		      else if(estabelecimento==2) 
		      {
		    	  if(area2<=100) 
		    	  {
		    		  calculo3= 35 + (area2 * 0.02);
		    		  
		    		  System.out.println("O total a se pagar � de R$" + calculo3);
		    	  }
		    	  else if(area2 > 100 & area2 <= 150) 
		    	  {
		    		calculo3 = 90 + (area2 * 0.04);
		    		
		    		if(calculo3 > 500) 
		    		{
		    			System.out.println("O total a se pagar � de R$500!");
		    		}
		    		else 
		    		{
		    			System.out.println("O total a se pagar � de R$" + calculo3);
		    		}
		    	  }
		      }
		      else if(estabelecimento==3) 
		      {
		    	  if(area2 <= 300) 
		    	  {
		    		  calculo3 = 55 + (area2 * 0.10);
		    		  System.out.println("O total a se pagar � de R$" + calculo3);
		    	  }
		    	  else if(area2 > 300 & area2 <=900) 
		    	  {
		    		  calculo3 = 190 + (area2 * 0.15);
		    		  System.out.println("O total a se pagar � de R$" + calculo3);
		          }
		    	  else if(area2 > 900) 
		    	  {
		    		  calculo3 = 350 + (area2 * 0.25);
		    		  
		    		  if(calculo3 > 1500) // <- se o valor a ser pago for maior que 1500, s� ser� pago 1500
		    		  {
		    			  System.out.println("O total a se pagar � de R$1500");
		    		  }
		    		  else 
		    		  {
		    			  System.out.println("O total a se pagar � de R$" + calculo3);
		    		  }
		    	  }
		      }
		      else 
		      {
		    	  System.out.println("Informe uma op��o v�lida!!");
		      }
		      
		      
		      break;
		      
			  case 9:
				  
				  break; //caso seja inserido o valor (9) o programa � interrompido
				  
			     
		      default: System.out.println("Informe uma op��o v�lida!!");  
		  }

		  
		  
		  
		  
		  
		  
		}while(opcao != 9);    //enquanto for diferente de 9 o programa continua rodando
		              //exibe o total de consultas feitas pelo usuario
		System.out.println("O total de consultas feitas foi/foram de " + consultas + " consulta(s)!!");
		                        
	
	}
 
}

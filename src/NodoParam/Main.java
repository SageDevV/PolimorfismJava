package NodoParam;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
				Lifo minha;
			
				String entra;
				int matr, idade, opcao, aux, quem;
				minha = new Lifo();

				do
				{
					entra = JOptionPane.showInputDialog(
							"\n\n\nSistema para brincar com Lifo" + "\n\n\t\t\tMenu\n\n\t1. Inserir\n\t2. Retirar"
									+ "\n\t3. Mostrar\n\t4. media de idade\n\t5. Achar funcionario\n\t9. Vazar\n\n\tDigite sua op��o");
					opcao = Integer.parseInt(entra);
					switch (opcao)
						{
						case 1:
							entra = JOptionPane.showInputDialog("Informe o n�mero da matricula");
							matr = Integer.parseInt(entra);
							entra = JOptionPane.showInputDialog("Informe a idade");
							idade = Integer.parseInt(entra);
							minha.inserir(matr, idade);
							break;
						case 2:
							aux=minha.retirar();
							if (aux == 0)
								System.out.println("LISTA VAZIA");
							else
							    System.out.println("\nMatricula retirada do topo foi "+ aux );
							break;

						case 3:
							minha.Mostrar();
							break;

						case 4:
							System.out.println("A media de idade �: "+ minha.Media());
							break;
							
						case 5:
							entra= JOptionPane.showInputDialog("informe a matricula");
							quem=Integer.parseInt(entra);
							System.out.println("A idade do funcionario da matricula �: "+ minha.achar(quem));
							break;
						}
				}
				while (opcao != 9);
				System.out.println("\nObrigado por usar o sistema - sistema feito por mim mesmo");
			}

			
		
	}


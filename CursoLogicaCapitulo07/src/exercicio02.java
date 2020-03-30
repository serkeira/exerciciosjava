public class exercicio02 {

	public static void main(String[] args) {
		
		
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 }; 
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 }; 
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 }; 
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 }; 
		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double[] somas = new Double[4];
		
		Double somaTemp = 0.0;
		
		//iterando cada semana dentro do array mes
		
		for (int i = 0; i < mes.length; i++) {
			somaTemp = 0.0;
			
			// iterando cada dia dentro de cada semana
			for (int y = 0; y < mes[i].length; y++)
			{
				//jogando para a soma temporaria
				somaTemp += mes[i][y];
			}
			
			//novo array somas recebendo cada soma total por semana
			somas[i] = somaTemp;
					
			}
		
			// encontrando o maior valor no array somas
			
			Double maximum = somas[0];
			Integer posicaoDoMaximo = 0; 
			
			for (int i = 0; i < somas.length; i++)
			{
				if (somas[i] > maximum)
				{
					maximum = somas[i];
					posicaoDoMaximo = i;
				}
			}
			
			// imprimindo a semana com maior valor
			System.out.println("A semana com maior valor foi a semana " + (posicaoDoMaximo+1));
			System.out.println("Esta semana teve uma soma de: R$ "+ maximum);
					
			
		
	}

}

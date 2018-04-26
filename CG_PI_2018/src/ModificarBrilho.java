import javax.swing.JOptionPane;


public class ModificarBrilho {

public static void main(String args[]) throws Exception {
		
		String caminho = ImagemUtil.selecionarCaminhoDaImagem();
		int alpha = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor")); 
		
		int img[][] = ImagemUtil.abrirImagemTonsDeCinza(caminho);
		ImagemUtil.visualizarImagem(img, "Teste antes");
		
		int largura = ImagemUtil.pegarLargura(img);
		int altura = ImagemUtil.pegarAltura(img);
		for(int y=0; y < altura; y++){
			for(int x=0; x < largura; x++){
				int soma = img[x][y] + alpha;
				if(soma > 255){
					img[x][y] = 255;
				}else if(soma < 0){
					img[x][y] = 0;
				}else{
					img[x][y] = soma;
				}
			}
		}
		
		
		//manipular
		
		ImagemUtil.visualizarImagem(img, "Teste depois");
		
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author internet
 */
public class ClarearImagem {
     public static void main(String[] args) throws Exception {

        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        int img[][] = ImagemUtil.abrirImagemTonsDeCinza(caminho);
        
        int largura = ImagemUtil.pegarLargura(img);
        int altura = ImagemUtil.pegarAltura(img);
        
        int imgSaida[][]= new int[largura][altura];
        
        for(int x=0; x<largura; x++){
            for (int y=0; y<altura; y++){
                imgSaida[x][y] =(int)(15.969 * Math.sqrt(img[x][y]));
            }
        }
          ImagemUtil.visualizarImagem(img, "entrada");
        ImagemUtil.visualizarImagem(imgSaida, "saída");
    }
}

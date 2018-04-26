/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author internet
 */
public class ClarearColorido {
     public static void main(String[] args) throws Exception {

        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        int img[][][] = ImagemUtil.abrirImagemColorida(caminho);
        
        int largura = ImagemUtil.pegarLargura(img);
        int altura = ImagemUtil.pegarAltura(img);
        int bang = 3;
        
        int imgSaida[][][]= new int[largura][altura][bang];
        
        for(int x=0; x<largura; x++){
            for (int y=0; y<altura; y++){
                imgSaida[x][y][0] =(int)(15.969 * Math.sqrt(img[x][y][0]));
                imgSaida[x][y][1] =(int)(15.969 * Math.sqrt(img[x][y][1]));
                imgSaida[x][y][2] =(int)(15.969 * Math.sqrt(img[x][y][2]));
            }
        }
          ImagemUtil.visualizarImagem(img, "entrada");
        ImagemUtil.visualizarImagem(imgSaida, "saída");
    }
}

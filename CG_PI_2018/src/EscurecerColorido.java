/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author internet
 */
public class EscurecerColorido {
     public static void main(String[] args) throws Exception {

        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        int img[][][] = ImagemUtil.abrirImagemColorida(caminho);
        
        int largura = ImagemUtil.pegarLargura(img);
        int altura = ImagemUtil.pegarAltura(img);
        int bang =3;
        int imgSaida[][][]= new int[largura][altura][bang];
        
        for(int x=0; x<largura; x++){
            for (int y=0; y<altura; y++){
               for(int banda =0; banda < 3; banda++){
                imgSaida[x][y][banda]= (int) Math.exp(img[x][y][banda] /(255 /  Math.log(256))); 
               
               }
            }
        }
          ImagemUtil.visualizarImagem(img, "entrada");
        ImagemUtil.visualizarImagem(imgSaida, "saída");
    }
}

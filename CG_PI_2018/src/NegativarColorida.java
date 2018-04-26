
public class NegativarColorida {
    
     public static void main(String[] args) throws Exception {

        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        int img[][][] = ImagemUtil.abrirImagemColorida(caminho);
        
        
        int largura = ImagemUtil.pegarLargura(img);
        int altura = ImagemUtil.pegarAltura(img);
        int bang = 3;
        
        int imgSaida[][][]= new int[largura][altura][bang];
        
        for(int x=0; x<largura; x++){
            for (int y=0; y<altura; y++){
              imgSaida[x][y][0] = 255- img[x][y][0];  
              imgSaida[x][y][1] = 255- img[x][y][1];
              imgSaida[x][y][2] = 255- img[x][y][2];
                
                
            }
        }
          ImagemUtil.visualizarImagem(img, "entrada");
        ImagemUtil.visualizarImagem(imgSaida, "saída");
    }
}


public class Negativo {
    
     public static void main(String[] args) throws Exception {

        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        int img[][] = ImagemUtil.abrirImagemTonsDeCinza(caminho);
        
        int largura = ImagemUtil.pegarLargura(img);
        int altura = ImagemUtil.pegarAltura(img);
        
        int imgSaida[][]= new int[largura][altura];
        
        for(int x=0; x<largura; x++){
            for (int y=0; y<altura; y++){
                imgSaida[x][y] = 255-img[x][y];
            }
        }
          ImagemUtil.visualizarImagem(img, "entrada");
        ImagemUtil.visualizarImagem(imgSaida, "saída");
    }
}

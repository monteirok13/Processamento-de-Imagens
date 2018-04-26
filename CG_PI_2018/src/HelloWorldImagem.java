public class HelloWorldImagem {    public static void main(String args[]) throws Exception {        String caminho = ImagemUtil.selecionarCaminhoDaImagem();        int img[][] = ImagemUtil.abrirImagemTonsDeCinza(caminho);                int largura = ImagemUtil.pegarLargura(img);        int altura = ImagemUtil.pegarAltura(img);                double xmedio = largura / 2;        double ymedio = altura / 2;                double angulo = 45;        int imgNova[][] = new int[largura][altura];        for(int x=0; x < largura; x++){            for(int y=0; y < altura; y++){                int cor = img[x][y];                                int xRot = Transformacao.getRotacaoX(x, y, xmedio, ymedio, angulo);                int yRot = Transformacao.getRotacaoY(x, y, xmedio, ymedio, angulo);                                if(ImagemUtil.pertenceAoDominio(img, xRot, yRot))                    imgNova[xRot][yRot] = cor;            }        }                //manipular        ImagemUtil.visualizarImagem(img, "Teste..");        ImagemUtil.visualizarImagem(imgNova, "Teste..");    }}
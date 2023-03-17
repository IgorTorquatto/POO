package celular;

public class Principal {
    public static void main(String[] args) throws Exception {
        //Declarando e instânciando(criando) um objeto:
        Celular celularA = new Celular();
        Celular celularB = new Celular();
        

        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";
        
        celularB.nome = "Samsung Young";
        celularB.tamanhoTela = 6.1;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";
        
       

        System.out.format("O celular %s com tela %.2f, com %d GB e SO %s \n",celularA.nome,celularA.tamanhoTela,celularA.espacoArmazenamento,celularA.sistemaOperacional);
        System.out.format("O celular %s com tela %.2f, com %d GB e SO %s",celularB.nome,celularB.tamanhoTela,celularB.espacoArmazenamento,celularB.sistemaOperacional);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fagner.alves
 */
/*Implementar em JAVA os seguinte métodos referentes à estrutura de uma Árvore Binária:

I) Inserção

II) Remoção

III) Busca

IV) Impressão (In Ordem, Pré Ordem e Pós Ordem)

V) Cálculo da altura da árvore

Trabalho Individual com entrevista.*/


public class Arvore {
    public ClasseNo Raiz;

    /*public ClasseNo getRaiz() {
        return Raiz;
    }

    public void setRaiz(ClasseNo Raiz) {
        this.Raiz = Raiz;
    }*/
    
    
    
    public void Inserir(int valor){
         ClasseNo folha = null,auxiliar;
    if(Raiz == null){
        Raiz = new ClasseNo();
        Raiz.setValor(valor);
        Raiz.setEsquerda(null);
        Raiz.setDireita(null);
    }else{
        auxiliar = Raiz;
        
        
        if(valor<auxiliar.getValor()){
        
          while (auxiliar.getEsquerda() != null) {
               auxiliar = auxiliar.getEsquerda();
          }
          if(valor<auxiliar.getValor()){
           folha = new ClasseNo();
           folha.setValor(valor);
           auxiliar.setEsquerda(folha);
           folha.setEsquerda(null);
           folha.setDireita(null);
          }
           if(valor>auxiliar.getValor()){
             folha = new ClasseNo();
           folha.setValor(valor);
           auxiliar.setDireita(folha);
           folha.setEsquerda(null);
           folha.setDireita(null);
           }
        
        }else if(valor>auxiliar.getValor()){
            
            while (auxiliar.getDireita() != null) {
               auxiliar = auxiliar.getDireita();
            }
            if(valor>auxiliar.getValor()){
            folha = new ClasseNo();
            folha.setValor(valor);
            auxiliar.setDireita(folha);
            folha.setEsquerda(null);
            folha.setDireita(null);
            }
           if(valor<auxiliar.getValor()){
             folha = new ClasseNo();
           folha.setValor(valor);
           auxiliar.setEsquerda(folha);
           folha.setEsquerda(null);
           folha.setDireita(null);
           }
           
           }
        }
    
    }
    
    
    /*public void Inserir(int valor){ // SEGUNDA VERSAO
         ClasseNo folha,auxiliar;
    if(Raiz == null){
        Raiz = new ClasseNo();
        Raiz.setValor(valor);
        Raiz.setEsquerda(null);
        Raiz.setDireita(null);
    }else{
        auxiliar = Raiz;
        if(valor<auxiliar.getValor()){
        
          while (auxiliar.getEsquerda() != null) {
               auxiliar = auxiliar.getEsquerda();
            }
   
           folha = new ClasseNo();
           folha.setValor(valor);
           auxiliar.setEsquerda(folha);
           folha.setEsquerda(null);
           folha.setDireita(null);
        }else if(valor>auxiliar.getValor()){
            
            while (auxiliar.getDireita() != null) {
               auxiliar = auxiliar.getDireita();
            }
            folha = new ClasseNo();
            folha.setValor(valor);
            auxiliar.setDireita(folha);
            folha.setEsquerda(null);
            folha.setDireita(null);
        }
    }
    }*/
    
    
     /*public void Inserir(int valor){ // PRIMEIRA VERSAO
         ClasseNo folha,auxiliar;
    if(Raiz == null){
        Raiz = new ClasseNo();
        Raiz.setValor(valor);
        Raiz.setEsquerda(null);
        Raiz.setDireita(null);
    }else if(Raiz != null){
        if(valor<Raiz.getValor()){
           folha = new ClasseNo();
           folha.setValor(valor);
           Raiz.setEsquerda(folha);
           folha.setEsquerda(null);
           folha.setDireita(null);
        }else{
            folha = new ClasseNo();
            folha.setValor(valor);
            Raiz.setDireita(folha);
            folha.setEsquerda(null);
            folha.setDireita(null);
        }
    }
    }*/
    
    public void ImprimirAPENAS(){
    ClasseNo auxiliar;
    auxiliar = Raiz;
        System.out.println("Valores da esquerda");
      while(auxiliar.getEsquerda() !=null){
            System.out.println(auxiliar.getValor()+ " ");
          auxiliar = auxiliar.getEsquerda();
    }
        System.out.println("Valores da direita");
         while(auxiliar.getDireita() !=null){
            System.out.println(auxiliar.getValor()+ " ");
          auxiliar = auxiliar.getDireita();
    }
    }
    
    
   /* public void Buscar(int valor){ //PRIMEIRA VERSAO
        ClasseNo auxiliar;
        auxiliar = Raiz;
    if(Raiz == null)
            System.out.println("Arvore nao tem elementos: ");
    
    
    else if(auxiliar != null && valor<auxiliar.getValor()){ 
        while(auxiliar.getEsquerda()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getEsquerda();
        
        if(auxiliar.getEsquerda()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");
        else
           System.out.println("O valor "+valor+" foi encontrado!");
    }
    else if(auxiliar != null && valor>=auxiliar.getValor()){ 
        while(auxiliar.getDireita()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getDireita();
        
        if(auxiliar.getDireita()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");
        else
           System.out.println("O valor "+valor+" foi encontrado!");
    }
    }*/
     
    /*public void Buscar(int valor){ //SEGUNDA VERSAO
        ClasseNo auxiliar;
        auxiliar = Raiz;
    if(Raiz == null)
            System.out.println("Arvore nao tem elementos: ");
    
    
    else{
       if(valor<auxiliar.getValor()){
           while(auxiliar.getEsquerda()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getEsquerda();
        
        if(auxiliar.getEsquerda()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");
        else
           System.out.println("O valor "+valor+" foi encontrado!");
       }
       if(valor<auxiliar.getValor()){
        while(auxiliar.getDireita()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getEsquerda();
       
        if(auxiliar.getDireita()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");
        else
           System.out.println("O valor "+valor+" foi encontrado!");
       }
        
    
    
    } 
    }*/
    
    public void Buscar(int valor){
        ClasseNo auxiliar;
        auxiliar = Raiz;
    if(Raiz == null)
            System.out.println("Arvore nao tem elementos: ");
    
    
    else{
       if(valor<auxiliar.getValor()){
           while(auxiliar.getEsquerda()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getEsquerda();
           
            if(valor == auxiliar.getValor()){
            System.out.println("O valor "+ valor +" foi encontrado!");
            }
           //if(valor<auxiliar.getValor()){
             //System.out.println("O valor "+ valor+ " foi encontrado!");
           //}
       
           
        
        /*if(auxiliar.getEsquerda()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");*/
        else
           System.out.println("O valor "+valor+" NÃO foi encontrado!");
       }
       if(valor>auxiliar.getValor()){
        while(auxiliar.getDireita()!=null && valor!=auxiliar.getValor())
               auxiliar = auxiliar.getEsquerda();
       
            if(valor==auxiliar.getValor()){
            System.out.println("O valor "+ valor +" foi encontrado!");
            }
          // if(valor<auxiliar.getValor()){
            // System.out.println("O valor "+ valor+ " foi encontrado!");
           //}
          
        /*if(auxiliar.getEsquerda()==null)
            System.out.println("O valor"+valor+"Não esta na arvore");*/
        else
           System.out.println("O valor "+valor+" NÃO foi encontrado!");
        
       }
        
    
    
    } 
    }
     
    
    public void Remover(){
    }
    
    
    
    
    
    
    public void ImprimirInOrder(ClasseNo Raiz){ //usar recursao
        ClasseNo auxiliar;
        auxiliar = Raiz;
        if(auxiliar !=null){
            ImprimirInOrder(auxiliar.getEsquerda());
            System.out.print(auxiliar.getValor()+" ");
            ImprimirInOrder(auxiliar.getDireita());
     }
    }
     public void ImprimirPreOrdem(ClasseNo Raiz){
      ClasseNo auxiliar;
        auxiliar = Raiz;
     if(auxiliar !=null){
     System.out.print(auxiliar.getValor()+" ");
     ImprimirPreOrdem(auxiliar.getEsquerda());
     ImprimirPreOrdem(auxiliar.getDireita());
     }
     }
    public void ImprimirPosOrdem(ClasseNo Raiz){
    ClasseNo auxiliar;
        auxiliar = Raiz;
         if(auxiliar !=null){
     ImprimirPosOrdem(auxiliar.getEsquerda());
     ImprimirPosOrdem(auxiliar.getDireita());
     System.out.print(auxiliar.getValor()+" ");
     }
    
    
    
    }
    
     public void menu(){
        int valor,opcao=0,pos;
	System.out.print("\n------------ Menu ------------\n");
	while(opcao!=-1){
            opcao = Input.readInt("\nDigite a opcao: \n(1) Inserir na Arvore \n(2)IMPRIMIR APENAS  \n(3) Buscar valor na árvore \n(4) Impressao em ordem  \n(5) Imprimir Pre Ordem \n(6)Imprimir Pos Ordem(Raiz); \n(7) Todas as Impressões\n(-1) Sair \nOpcao: ");
            switch(opcao){
			
                case 1: //insereInicio
                    valor = Input.readInt("Digite um numero: ");
                    Inserir(valor);
		break;
				
		case 2: 
                   ImprimirAPENAS();
		break;
				
		case 3: 
                    valor = Input.readInt("Digite um numero para buscar na arvore: ");
                    Buscar(valor);
                    
		break;
				
                case 4: //Impressao em ordem
                    ImprimirInOrder(Raiz);
		break;
				
		case 5: //imprime
                    ImprimirPreOrdem(Raiz);
		break;
	        
                case 6:
                    ImprimirPosOrdem(Raiz);
                break;

                case 7:
                    System.out.println("************Todas as Impressões***********\n");
                    System.out.println("EM ordem");
                    ImprimirInOrder(Raiz);
                    System.out.println();
                    System.out.println("PRE ordem");
                    ImprimirPreOrdem(Raiz);
                    System.out.println();
                    System.out.println("POS ordem");
                    ImprimirPosOrdem(Raiz);
                    System.out.println();
                    System.out.println("*****FIM******");
                break;
		case -1: //sair
                    System.out.println("Saindo!");
		break;
				
		default:
                    System.out.println("Opcao invalida!");
		break;
			
            }
		
	}
    }
    
    public static void main (String args[]){
    
    Arvore ArvoreBinaria = new Arvore();
    
    ArvoreBinaria.menu();
    
    }
}

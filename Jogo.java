package jogo;
import javax.swing.JOptionPane;

public class Jogo {
    
    public static void criatura(){
        String escolha_str;
        String menu3 = "**Combate**";
        menu3 +="\nAventureiro(a) faça sua escolha:\n1- Enfrentar a criatura diretamente\n2- Dar um sanduíche com sonífero para ela";
        escolha_str = JOptionPane.showInputDialog(null, menu3);
        
        for(int cont=1;cont<=3;cont++){
            if(escolha_str.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(null, "GAME OVER\nAventureiro(a) infelizmente você não conseguiu fugir da criatura e ficou preso(a) na caverna para sempre...");
                break;
            }
            else if(escolha_str.equalsIgnoreCase("2")){
                JOptionPane.showMessageDialog(null, "PARABÉNS!\nVocê fez a criatura cair um um sono profundo e encontrou com ela um pergaminho que possuia um mapa que levava a uma saída secreta.\nDepois de seguir o mapa você conseguiu escapar e está livre da caverna.");
                break;
            }
            else{
               JOptionPane.showMessageDialog(null, "Essa escolha não existe, tente novamente.");
            }
        }      
    }   
      
    public static void mar(){
        String decisao_str;
        String menu2 = "***Hora da Grande Decisão***";
        menu2+="\n1 Confiar na correnteza e pular\n2 Tentar voltar e achar outra saída";
        
        for (int tentativa=1;tentativa<=3;tentativa++){
            decisao_str = JOptionPane.showInputDialog(null, menu2);
        
            if(decisao_str.equalsIgnoreCase("1")){
             JOptionPane.showMessageDialog(null,"PARABÉNS\nVocê encontrou a saída da caverna e agora está livre para vivenciar novas aventuras!");
             break;
            }
            else if(decisao_str.equalsIgnoreCase("2")){
             JOptionPane.showMessageDialog(null,"Quando estava voltando, você encontrou uma criatura que guarda a caverna.\nAgora você precisará enfrentá-la...");
             JOptionPane.showMessageDialog(null, "A criatura é muito grande e assutadora, você tem duas opções:\n1- A primeira é enfrentá-la e tentar a sorte de conseguir escapar dela.\n2- A segunda é utilizar o sanduíche que você tem na bolsa com um pouco de sonífero, isso fará com que a criatura caia em um sono de 3 horas.");
             criatura();
             break;
            }
            else{
              JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");  
            } 
        }
    }
    
    public static void menuCaminho (){
        String escolha_str;
        String menu = "***Escolha seu caminho***";
        menu+="\n1 Corredor iluninado por tochas \n2 Tunel escuro e estreito";
        
        for(int escolha_int=1; escolha_int<=3; escolha_int++){
            escolha_str = JOptionPane.showInputDialog(null, menu);
        
            if(escolha_str.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(null,"As tochas eram uma armadilha mágica\nvocê foi transportado(a) para um labirinto ilusório e\nprecisará decifrar um enigma para escapar\nou ficará preso para sempre...");
                //enigma (Adicionar)
                break;
            }
            else if(escolha_str.equalsIgnoreCase("2")){
                JOptionPane.showMessageDialog(null, "Quando você entrou no túnel escuro seguiu em frente e cada vez o barulho de água ficava mais forte,\nchegando ao final do tunel você encontrou um rio subterrâneo");
                mar();
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }  
    }

    public static void main(String[] args) {
        String nome_str;
        
        nome_str = JOptionPane.showInputDialog(null, "Olá aventureiro(a)\n Você está prestes a se aventurar por uma floresta misteriosa\npara começar digite seu nome:");
        JOptionPane.showMessageDialog(null,nome_str + " você é um(a) aventureiro(a) explorando uma floresta misteriosa\nquando encontra uma caverna oculta entre as árvores. Um velho\npergaminho que você carrega diz que dentro dela há um artefato mágico\npoderoso, mas também perigos desconhecidos.");       
        JOptionPane.showMessageDialog(null, "Ao entrar na caverna, a passagem atrás de você desmorona,\ne agora só há um caminho: Seguir em frente.");
        JOptionPane.showMessageDialog(null, "Depois de caminhar por alguns metros, você encontra duas passagens:\n 1- Um corredor iluminado por tochas azuis, com símbolos antigos gravados nas paredes. Parece seguro, mas algo naquelas luzes não parece natural.\n 2- Um túnel escuro e estreito, de onde você ouve um som distante de água corrente. A escuridão é assustadora, mas pode levar a uma saída.  ");
        JOptionPane.showMessageDialog(null, nome_str + " agora você precisará escolher qual caminho seguir, para isso utilize todas as suas experiências adquiridas em aventuras passadas");
        menuCaminho();
    }
    
}

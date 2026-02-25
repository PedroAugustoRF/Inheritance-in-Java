##### **Herança:**



* Herança é um tipo de associação;
* Permite que uma Sub Classe herde todos atributos e métodos de uma Super Classe
* São uteis para o Polimorfismo e reuso



* **Sintaxe:** 
* public class CarroConversivel extends Carro {} 
* CarroConversivel herda todos atributos e métodos de Carro



* Herança é uma relação "é um" ou seja, uma Sub Classe é uma Super Classe
* A Sub Classe é uma extensão da Super Classe 
* Por fim, ao instanciar objeto do tipo da Sub Classe, você só tem um objeto e não dois



##### **Upcasting e Downcasting:**



* Upcasting é "transformar" uma Sub Classe em uma Super Classe 
* Usado muito no Polimorfismo
* É completamente normal instanciar um objeto da sub classe em uma super classe



* Downcasting é "transformar" uma Super Classe em Sub Classe
* Caso uma Super Classe queira ser atribuída em uma Sub Classe ela precisa sofrer um casting



* **Casting para Donwcasting:**
* SuperClasse classe;
* SubClasse subclasse = (SubClasse) classe;
* Toda vez que for atribuir uma Super Classe a uma Sub Classe você deve fazer o casting da Super para Sub



* Usamos a palavra instanceof para verificar se um objeto é instancia de uma Classe



##### **Sobreposição:**



* É a implementação de um método de uma Super Classe dentro de uma Sub Classe
* É ideal usar a anotação @Override num método sobrescrito:
* @Override é ideal para facilitar a leitura e compreensão do código
* É uma boa prática pois é um aviso ao Compilador



* É possível usar a palavra super. para chamar um método da superclasse dentro de um método sobreposto da subclasse
* E depois de realizar o método ainda daria para modificar ou incluir mais lógica



##### **Final:**



* A Palavra Final junto com a classe evita que ela seja herdada
* public final class Classe {} final evita que seja herdada

&nbsp;		

* A Palavra Final junto a métodos evita que eles sejam sobrepostos
* public final void Metodo {} final evita que o método seja sobrescrito

&nbsp;		

* Em resumo, final evita que uma classe seja herdada e que métodos sejam sobrepostos

&nbsp;		

* final é usado por segurança, dependendo das regras de negócio:
* uma classe não deve ser herdada
* ou um método sobreposto

&nbsp;		

* convém usar final em métodos sobrepostos
* tipo final é mais rápido a ser executado




import kotlin.random.Random
import java.util.Scanner


class Pessoa(var nome:String, var idade: Int, var profissao: String)
class Produto(var nome: String, var preco: Double, var quantidade: Int)


fun main() {
    // Exercicio 1
    var contPar = 0
    var contImpar = 0

    for(i in 0..9){

        var numero = Random.nextInt(0,50)
        println("Numero sorteado $numero")

        if(numero % 2 == 0){
            contPar++
        }else{
            contImpar++
        }
    }

   println("Numeros par $contPar")
   println("Numeros impares $contImpar")

   // Exercício 2
    for(i in 1..1){

        var numero = Random.nextInt(1,7)
        println("Lado do dado = $numero")

    }
    // Exercício 3
    var p1 = Pessoa("Isabelle", 27, "Biomedica")
    var p2 = Pessoa("João Pedro", 31, "Mecânico")
    var p3 = Pessoa("Patricia", 29, "Contadora")
    val pessoas = mutableListOf(p1,p2,p3)


    for(i in pessoas){
       println("${i.nome},${i.idade}, ${i.profissao}")
    }

    // Exercício 4
    var prod1 = Produto("Café", 15.0,10)
    var prod2 = Produto("Café Goumert", 31.0,10)
    var produtos = mutableListOf(prod1,prod2)
    var contador: Int = 1

    for(i in produtos){
        println(" Produtos $contador: ${i.nome}, preço: R$ ${i.preco}, quantidade: ${i.quantidade}")
        contador++
    }
    val scanner = Scanner(System.`in`)
    print("Digite um número do produto que você deseja alterar o valor: ")
    var numero = scanner.nextInt()

    if(numero == 1){
        println("Digite o novo valor: ")
        val novoValor = scanner.nextDouble()
        produtos[0].preco = novoValor
        println("Qual a nova quantidade?")
        val novaQuantidade = scanner.nextInt()
        produtos[0].quantidade = novaQuantidade
        println("Produto alterado!")
    }else if (numero == 2){
        println("Digite o novo valor: ")
        val novoValor = scanner.nextDouble()
        produtos[1].preco = novoValor
        println("Qual a nova quantidade?")
        val novaQuantidade = scanner.nextInt()
        produtos[1].quantidade = novaQuantidade
        println("Produto Alterado")
    }

    contador = 1
    println("Deseja ver a lista atualizada? [1] sim [2] não")
    var n = scanner.nextInt()
     if (n == 1){
         for(i in produtos){
             println(" Produtos $contador: ${i.nome}, preço ${i.preco}, quantidade: ${i.quantidade}\n")
             contador++
         }
     }


    println("------------------------------")
    println("Programa Finalizado")
    scanner.close()
}




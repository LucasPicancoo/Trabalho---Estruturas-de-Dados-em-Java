## 📘 Trabalho – Estruturas de Dados em Java

Este projeto reúne implementações e testes experimentais de diversas estruturas de dados e algoritmos clássicos em Java, com foco em análise de desempenho.
Entre os componentes avaliados estão **árvore binária de busca (ABB)**, **árvore AVL**, **vetores**, **buscas** e **métodos de ordenação**.

O objetivo do projeto é comparar o comportamento e o custo computacional das operações de inserção, busca e ordenação em diferentes cenários (crescente, decrescente e aleatório), aplicando conceitos teóricos de Análise de Algoritmos.

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    Trabalho---Estruturas-de-Dados-em-Java/
    │
    ├── arvore/
    │   ├── Arvore.java
    │   ├── ArvoreAVL.java
    │   └── No.java
    │
    ├── tests/
    │   ├── ArvoreABB/
    │   │   ├── TesteBuscaABB.java
    │   │   └── TesteInsercaoABB.java
    │   │
    │   ├── ArvoreAVL/
    │   │   ├── TesteBuscaAVL.java
    │   │   └── TesteInsercaoAVL.java
    │   │
    │   └── Vetor/
    │       ├── TesteBuscaBinariaVetor.java
    │       ├── TesteBuscaSequencialVetor.java
    │       ├── TesteInsercaoVetor.java
    │       ├── TesteOrdenacaoAvancadaVetor.java
    │       └── TesteOrdenacaoSimplesVetor.java
    │
    ├── Utils/
    │   ├── BuscarValorArvore.java
    │   ├── Gerador.java
    │   ├── Timer.java
    │   └── Troca.java
    │
    ├── Vetor/
    │   ├── OrdenacaoAvancada.java
    │   ├── OrdenacaoSimples.java
    │   └── Vetor.java
    │
    └── Principal.java

------------------------------------------------------------------------

## 🧪 O que foi testado?

### **Árvores**

-   Comparação ABB vs AVL
-   Inserção em cenários diferente (crescente, decrescente, aleatório)
-   Busca em diferentes tipos de elementos

### **Vetores**

-   Busca sequencial e binária
-   Ordenações simples (BubbleSort)
-   Ordenações avançadas (QuickSort)

### **Cenários gerados**

-   Crescente
-   Decrescente
-   Aleatório

------------------------------------------------------------------------

## 🚀 Como executar

1.  Clone o repositório:

``` bash
git clone https://github.com/LucasPicancoo/Trabalho---Estruturas-de-Dados-em-Java.git
```

2.  Abra em sua IDE Java (IntelliJ, VSCode, Eclipse etc.)

3.  Compile:

``` bash
Principal.java
```

4.  Execute:

``` bash
Principal.java
```

------------------------------------------------------------------------

## 🎯 Objetivo Geral

O projeto foi desenvolvido como parte da disciplina de **Estruturas de
Dados**, permitindo:

-   Validar conceitos teóricos de complexidade algorítmica
-   Comparar desempenho entre diferentes estruturas
-   Analisar a influência dos tipos de entrada
-   Observar experimentalmente a eficiência de algoritmos clássicos

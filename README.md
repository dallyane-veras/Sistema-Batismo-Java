Sistema de Gestão de Batismo Paroquial
🚀 Sobre o Projeto

Este é um sistema desenvolvido em Java com arquitetura desktop (Swing) e base de dados relacional (MySQL). O objetivo principal da aplicação é otimizar o fluxo de registos paroquiais, permitindo cadastros ágeis, consultas estruturadas e emissão automatizada de relatórios em PDF.

🛠️ Tecnologias e Ferramentas Utilizadas

    Linguagem: Java

    Interface Gráfica (UI): Java Swing / JInternalFrames

    Base de Dados: MySQL (com driver JDBC)

    Relatórios: JasperReports & iReport

    Gestão de Dependências / Build: NetBeans / IntelliJ IDEA

⚙️ Principais Funcionalidades

    Gestão de Cadastros: Registo completo de batismos, paroquianos, padrinhos e ministros.

    Busca Avançada: Filtros dinâmicos e consultas otimizadas diretamente na base de dados.

    Geração de Relatórios: Emissão de certidões e relatórios paroquiais formatados através do JasperReports.

    Segurança e Conexão: Módulo centralizado de ligação à base de dados com suporte a PreparedStatements para prevenção de falhas de segurança.

📂 Estrutura do Projeto
Plaintext

Sistema-Batismo-Java/
├── src/
│   ├── conexao/         # Configuração e gestão da ligação JDBC
│   ├── relatorio/       # Ficheiros de layout (.jrxml) do JasperReports
│   └── telas/           # Ecrãs e componentes visuais (Java Swing)
├── libraries/           # Dependências e drivers externos (MySQL, Jasper)
└── .gitignore

💻 Como Executar o Projeto Localmente

    Pré-requisitos:

        Ter o Java JDK instalado (compatível com a versão do projeto).

        Ter um servidor MySQL a correr localmente (ex: XAMPP ou MySQL Server).

    Base de Dados:

        Crie uma base de dados no MySQL compatível com a estrutura da aplicação.

        Configure os dados de acesso (utilizador e palavra-passe) na classe de conexão do projeto (conexaobanco.java).

    Execução:

        Abra o projeto no IntelliJ IDEA.

        Certifique-se de que todas as bibliotecas (libraries) estão adicionadas ao Classpath do projeto.

        Execute a classe principal para iniciar a interface gráfica.

👩‍💻 Autoria

Desenvolvido por Dallyane Veras.

# IntentsCompose

Projeto Android desenvolvido com Jetpack Compose, demonstrando o uso de Intents explícitas e implícitas.

## Descrição

Aplicativo com duas telas: uma tela principal com menu de ações e uma tela para definição de parâmetro. Demonstra navegação entre telas com retorno de resultado e o uso de Intents implícitas para abrir URLs, discar e realizar ligações.

## Funcionalidades

- Exibição de parâmetro definido pelo usuário na tela principal
- Navegação para tela de edição de parâmetro com retorno de resultado
- Intent implícita para abertura de URL no navegador
- Intent implícita para discagem de número telefônico
- Intent implícita para realização de ligação (requer permissão `CALL_PHONE`)

## Requisitos

- Android Studio Meerkat (2024.3.1) ou superior
- Kotlin 2.2.0
- Gradle 9.2.1
- AGP 9.0.1
- API mínima: 26 (Android 8.0 Oreo)

## Estrutura do Projeto

```
intentscompose/
├── navigation/
│   └── Navigation.kt       # Rotas e NavHost
├── ui/
│   ├── main/
│   │   └── MainScreen.kt   # Tela principal com menu
│   ├── parameter/
│   │   └── ParameterScreen.kt  # Tela de edição de parâmetro
│   └── theme/              # Tema do app (gerado pelo Android Studio)
└── MainActivity.kt
```

## Tecnologias

- Jetpack Compose
- Navigation Compose
- Material3
- Intents implícitas (ACTION_VIEW, ACTION_DIAL, ACTION_CALL)

## Informações Acadêmicas

- **Instituição:** IFSP - Instituto Federal de São Paulo, câmpus São Carlos
- **Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas
- **Disciplina:** Programação para Dispositivos Móveis
- **Aluno:** sc3037291
- **Pacote:** `br.edu.ifsp.scl.sc3037291.intentscompose`

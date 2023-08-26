# Projeto Tesouraria FENSG

## Introdução

O Projeto Tesouraria FENSG foi desenvolvido utilizando a linguagem Java, juntamente com a framework Swing, para criar a interface do aplicativo. O objetivo do projeto era atender à necessidade da instituição de ensino Universidade de Pernambuco — UPE, na unidade em que realizo meu estágio na área de infraestrutura. A tesouraria da universidade precisava realizar cálculos para os valores em atraso dos alunos da pós-graduação, e essa aplicação foi desenvolvida para facilitar esse processo.

## Desenvolvimento

A interface do projeto foi toda criada utilizando o Swing, que é uma biblioteca gráfica do Java. Foram implementados campos que aceitam apenas valores numéricos, para isso, utilizei a biblioteca "RestrictedTextField". Essa abordagem garantiu que apenas valores válidos fossem inseridos, tornando a aplicação mais robusta e menos propensa a erros.

Além disso, o projeto conta com um botão que permite limpar os campos, facilitando a correção de erros ou a realização de novos cálculos sem a necessidade de reiniciar a aplicação.

Outro recurso interessante implementado foi a possibilidade de utilizar links externos no Java. Dessa forma, criei uma interface adicional para divulgar a equipe de TI à qual faço parte, juntamente com o link para o site da instituição de ensino. Também incluí um botão que direciona diretamente ao meu portfólio no GitHub, tornando o projeto mais interativo e possibilitando o acesso rápido a informações adicionais.

## Imagens do Projeto

![Imagem 1](https://github.com/RobsonFe/ProjetoTesourariaFENSG/assets/115955245/c8164b07-79a0-45e8-96bc-0f022c8f4b25)

- Calculo da divida recebendo os valores do usuario e sendo calculados.
```
JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double divida = 390.00;
				double multa = 7.80;
				double DiasAtraso = Double.parseDouble(txtDiasAtraso.getText());
				
				if (DiasAtraso > 0) {
			         double juros = 0.02 * DiasAtraso;
			         divida += juros + multa;
			      }
				txtTotal.setText(String.valueOf(String.format("%.2f", divida)));
			}
		});
  ```

- Configuração de link de página ao clicar no botão, utilização da biblioteca para validar os campos apenas com números e função de limpar a caixa de texto.
  
```
JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			} // Linkando a classe sobre a Classe Projeto.
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Sobre");
		btnNewButton_2.setIcon(new ImageIcon(ProjetoFENSG.class.getResource("/icons/About.png")));
		btnNewButton_2.setBounds(370, 18, 48, 48);
		contentPane.add(btnNewButton_2);
		
		RestrictedTextField validar = new RestrictedTextField(txtDiasAtraso);
		validar.setOnlyNums(true);
	} // fim do construtor
	
	private void limpar() {
		txtDiasAtraso.setText(null);
		txtTotal.setText(null);
	} //Metodo para limpar caixa de texto.
}
```

- Método para abrir sites externos no Java.
```
private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try{
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e) {
			System.out.println(e);
		}
	}// Metodo para habilitar abertura de sites no Java.

}
```

## Conclusão

O Projeto Tesouraria FENSG foi uma iniciativa para suprir uma demanda específica da tesouraria da Universidade de Pernambuco. Através da interface desenvolvida com a framework Swing, foi possível criar uma aplicação prática, de fácil utilização e que auxilia no cálculo de valores em atraso dos alunos de pós-graduação.

Ao longo do desenvolvimento, pude explorar diversas funcionalidades da linguagem Java e utilizar bibliotecas que otimizaram o processo de validação dos campos. Além disso, a inclusão de links externos e botões adicionais enriqueceram a aplicação, tornando-a mais interativa e funcional.

O Projeto Tesouraria FENSG representa um passo importante na minha trajetória como desenvolvedor, contribuindo para aprimorar minhas habilidades técnicas e permitindo a aplicação prática do conhecimento adquirido. Com essa experiência, estou mais preparado para enfrentar novos desafios no desenvolvimento de projetos futuros.

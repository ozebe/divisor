# Divisor de tensão com Resistências

## Neste circuito, dois resistores são ligados em série como no diagrama unifilar a seguir:
![Circuito](https://upload.wikimedia.org/wikipedia/commons/8/8f/Voltage_divider.svg)

### Esse pequeno programa pode ser utilizado para determinar a quantia em ohms de uma divisão de tensão.
caso você tenha a tensão de entrada e a tensão de saída e pelo menos um valor de resistor informado você pode encontrar a quantia em ohms de uma divisão de tensão. Também pode ser utilizado para encontrar a tensão de entrada ou de saída,
mas para isso é necessário que exista pelo menos a tensão de entrada ou de saída e também ambos os valores de resistores.
o cálculo é o seguinte:
#### I = Input Voltage
#### O = Output voltage
#### R1 = Resistor 1
#### R2 = Resistor 2
#### I = O * ((R1 + R2) / R2)
#### O = I * (R2 / (R1 + R2))
#### R1 = (I * R2 / O) - R2
#### R2 = O * R1 / (I - O)

Calc.java possui a seguinte função para realizar o cálculo:
```java
public static void calcular() {
        try {
            if (((tensaoEntrada.getText().isEmpty()) || (tensaoEntrada.getText() == null)) && ((tensaoSaida.getText().isEmpty()) || (tensaoSaida.getText() == null))) {
                JOptionPane.showMessageDialog(null, "É necessário colocar a tensão de entrada ou de saída", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                if ((tensaoEntrada.getText().isEmpty()) || (tensaoEntrada.getText() == null)) {

                    float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                    if (((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) || ((resistor2.getText().isEmpty()) || (resistor2.getText() == null))) {
                        JOptionPane.showMessageDialog(null, "É necessário colocar os dois valores dos resistores\npara calcular a tensão de entrada", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {

                        float R1 = Float.parseFloat(resistor1.getText());
                        float R2 = Float.parseFloat(resistor2.getText());
                        float I = O * ((R1 + R2) / R2);
                        DecimalFormat df = new DecimalFormat("#0.00");
                        tensaoEntrada.setText(df.format(I));
                    }
                } else if ((tensaoSaida.getText().isEmpty()) || (tensaoSaida.getText() == null)) {
                    float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                    if (((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) || ((resistor2.getText().isEmpty()) || (resistor2.getText() == null))) {
                        JOptionPane.showMessageDialog(null, "É necessário colocar os dois valores dos resisitores\npara calcular a tensão de saída", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        float R1 = Float.parseFloat(resistor1.getText());
                        float R2 = Float.parseFloat(resistor2.getText());
                        float O = I * (R2 / (R1 + R2));
                        DecimalFormat df = new DecimalFormat("#0.00");
                        tensaoSaida.setText(df.format(O));
                    }
                } else {
                    if ((resistor1.getText().isEmpty() || (resistor1.getText() == null)) && (resistor2.getText().isEmpty()) || (resistor2.getText() == null)) {
                        JOptionPane.showMessageDialog(null, "É necessário colocar pelo menos um valor de resistor", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if ((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) {
                            float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                            float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                            if (O > I) {
                                JOptionPane.showMessageDialog(null, "A tensão de saída não pode ser maior que a de entrada", "Erro", JOptionPane.ERROR_MESSAGE);
                            } else {
                                float R2 = Float.parseFloat(resistor2.getText());
                                float R1 = (I * (R2 / O)) - R2;
                                DecimalFormat df = new DecimalFormat("#0.00");
                                resistor1.setText(df.format(R1));
                            }
                        } else if ((resistor2.getText().isEmpty()) || (resistor2.getText() == null)) {
                            float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                            float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                            if (O > I) {
                                JOptionPane.showMessageDialog(null, "A tensão de saída não pode ser maior que a de entrada", "Erro", JOptionPane.ERROR_MESSAGE);
                            } else {
                                float R1 = Float.parseFloat(resistor1.getText());
                                float R2 = O * R1 / (I - O);
                                DecimalFormat df = new DecimalFormat("#0.00");
                                resistor2.setText(df.format(R2));
                            }
                        }
                    }
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Utilize apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
  ```
##### Criado por Wesley Ozebe
##### Versão 1.2

##### Data da atualização 1.2: 31/01/2018
##### Data da atualização 1.1: 25/01/2018
##### Data da atualização 1.0: 24/01/2018


###### Mudanças da atualização 1.2:
###### Corrigido um erro que causava exception caso tivesse os valores das duas tensões mas sem valores de resistores.
###### Corrigido um erro que causava exeception caso fosse colocado algo diferente de números.
###### Corrigido um erro onde a voltagem de saída poderia ser maior que a de entrada.

###### Mudanças da atualização 1.1:
###### Corrigido o sistema de cálculo, sendo possível calcular as tensões de entrada ou saída tendo os valores de resistência.
###### Adicionado o tema Dargula como o tema padrão do programa.

###### Mudanças da atualização 1.0:
###### Criado a lógica básica de cálculo.
###### Criado a interface básica do programa.




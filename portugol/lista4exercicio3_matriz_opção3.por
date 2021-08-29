programa
{

	funcao inicio ()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		para(inteiro x=0; x <4; x ++) {
			para (inteiro y=0; y <6; y ++) {
				escreva("\nDigite o valor da matriz N1 na linha " +x+ " e na coluna "+y+ ": ")
				leia (n1[x][y])
			}
		}
		para (inteiro x=0; x<4; x++) {
			para (inteiro y=0; y<6;y++) {
				escreva("\nDigite o valor da matriz N2 na linha " +x+ " e na coluna " +y+ ": ")
				leia (n2[x][y])
			}
		}
		para(inteiro x=0; x<4; x++) {
			para(inteiro y=0; y <6; y ++) {
				m1[x][y]=n1[x][y]+n2[x][y]
			}
		}
		para (inteiro x=0; x<4; x++) {
			para (inteiro y=0; y<6; y++){
				se (n1[x][y]>n2[x][y]){
					m2[x][y]=n1[x][y]-n2[x][y]
				}
				senao {
					m2[x][y]=n2[x][y]-n1[x][y]
				}

			}
		}
		escreva("\nA matriz M1 é:")
		para(inteiro x=1; x<4; x++) {
			escreva("\n")
			para(inteiro y=1; y<6; y++) {
				escreva (m1[x][y]+"\t")								
			}
		}
		escreva("\nA matriz M2 é:")
		para (inteiro x=1; x<4; x++) {
			escreva("\n")
			para (inteiro y=1; y<6; y++) {
				escreva(m2[x][y], "\t")								
			}
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1064; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 20, 2}-{m1, 6, 30, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
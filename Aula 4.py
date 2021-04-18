# import random
# numero=random.randint(1,20)
# jogo=int(input('Escolha um número de 1 a 20: '))
# if numero > jogo:
#      print('Muito baixo')
# elif numero < jogo:
#     print('Muito alto')
# else:
#     print('acertou')

####################################################
# duvida=input('Tem dúvida? ')
# if duvida == 'não':
#     print('Tchau')
# else:
#     print('Pratique mais')

######################################################
# tem_duvidas = True

# if tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Pratique mais')

# if tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Pratique mais')

# if tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Pratique mais')

# if tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Pratique mais')

# if tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Até a próxima')
#########################################################3
# tem_duvidas = True

# while tem_duvidas:
#     resposta_do_aluno = input('Você está com dúvidas? ')

#     if resposta_do_aluno == 'não':
#         print('Parabéns!')
#         tem_duvidas = False
#     else:
#         print('Pratique mais')
############################################################
# numero2=True
# i=1
# import random
# numero=random.randint(1,20)
# while numero2:
#     jogo=int(input('Escolha um número de 1 a 20: '))
#     if numero > jogo:
#         print('Muito baixo')
#     elif numero < jogo:
#         print('Muito alto')
#     else:
#         print('acertou')
#         print('Tentativas: {0}'.format(i))
#         numero2=False
#     i+=1
#####################OUTRA FORMA###########################
# import random
# a=random.randint(1, 20)
# b=int(input('Escolha um número entre 1 a 20: '))
# i=1
# while a!=b:
#     i+=1
#     if a > b:
#         print('Muito alto')
#     elif a < b:
#         print('Muito baixo')
    
#     b=int(input('Escolha um número entre 1 a 20: '))
# print('Tentativas:{0}'.format(i))
############################################################3
import random
a=random.randint(1, 20)
b=int(input('Escolha um número entre 1 a 20: '))
while b<1 or b>20:
    print('Invalido')
    b=int(input('Escolha um número entre 1 a 20: '))
i=1
while b!=a and i<5:
    i+=1
    if b<a:
        print('Muito baixo')
    elif b>a:
        print('Muito alto')
    b=int(input('Escolha um número entre 1 a 20: '))
    while b<1 or b>20:
        print('Invalido')
        b=int(input('Escolha um número entre 1 a 20: '))
if a!=b:
    print('Voce perdeu')
else:
    print('Tentativas:{0}'.format(i))


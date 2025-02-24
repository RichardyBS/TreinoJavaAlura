import br.com.bdemanhwa.modules.Manga;
                            import br.com.bdemanhwa.modules.Manhwa;

                            import java.util.ArrayList;
                            import java.util.List;
                            import java.util.Scanner;

                            public class Main {
                                private static List<Manhwa> manhwas = new ArrayList<>();

                                public static void main(String[] args) {
                                    Scanner s = new Scanner(System.in);

                                    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Luffy e sua tripulação em busca do One Piece", 1000, 1997);

                                    Manhwa initialManhwa = new Manhwa("Solo Leveling", "Chugong", "Um caçador fraco que se torna o mais forte", 200, 2018);

                                    int typeUser;

                                    while (true) {
                                        System.out.println("Menu de Manhwa. \n Opções do menu: ");
                                        System.out.println("1. Para Criar Manhwa");
                                        System.out.println("2. Para Ver Manhwa");
                                        System.out.println("3. Editar Manhwa");
                                        System.out.println("4. Para Deletar Manhwa");
                                        System.out.println("5. Para Sair");
                                        System.out.print("Escolha uma opção: ");
                                        typeUser = s.nextInt();
                                        s.nextLine();  // Consumir a quebra de linha do nextInt

                                        if (typeUser == 1) {
                                            // Criar novo Manhwa
                                            System.out.println("Digite o título: ");
                                            String titulo = s.nextLine();
                                            System.out.println("Digite o autor: ");
                                            String autor = s.nextLine();
                                            System.out.println("Digite a sinopse: ");
                                            String sinopse = s.nextLine();
                                            System.out.println("Digite o número de capítulos: ");
                                            int capitulos = s.nextInt();
                                            System.out.println("Digite o ano da obra: ");
                                            int dataObra = s.nextInt();
                                            s.nextLine();  // Consumir a quebra de linha

                                            Manhwa novoManhwa = new Manhwa(titulo, autor, sinopse, capitulos, dataObra);
                                            manhwas.add(novoManhwa);
                                            System.out.println("Manhwa criado com sucesso!");
                                        } else if (typeUser == 2) {
                                            // Ver manhwas
                                            if (manhwas.isEmpty()) {
                                                System.out.println("Não há manhwas cadastrados.");
                                            } else {
                                                for (Manhwa manhwa : manhwas) {
                                                    manhwa.exibeManhwa();
                                                    System.out.println("-----------------------------------");
                                                }
                                            }
                                        } else if (typeUser == 3) {
                                            // Editar manhwa
                                            if (manhwas.isEmpty()) {
                                                System.out.println("Não há manhwas cadastrados.");
                                            } else {
                                                System.out.println("Digite o título do manhwa a ser editado: ");
                                                String tituloEditar = s.nextLine();
                                                boolean encontrado = false;
                                                for (Manhwa manhwa : manhwas) {
                                                    if (manhwa.getTitulo().equalsIgnoreCase(tituloEditar)) {
                                                        encontrado = true;
                                                        System.out.println("Digite o novo título: ");
                                                        manhwa.setTitulo(s.nextLine());
                                                        System.out.println("Digite o novo autor: ");
                                                        manhwa.setAutor(s.nextLine());
                                                        System.out.println("Digite a nova sinopse: ");
                                                        manhwa.setSinopse(s.nextLine());
                                                        System.out.println("Digite o novo número de capítulos: ");
                                                        manhwa.setCapitulos(s.nextInt());
                                                        System.out.println("Digite o novo ano da obra: ");
                                                        manhwa.setDataObra(s.nextInt());
                                                        s.nextLine();  // Consumir a quebra de linha
                                                        System.out.println("Manhwa atualizado com sucesso!");
                                                        break;
                                                    }
                                                }
                                                if (!encontrado) {
                                                    System.out.println("Manhwa não encontrado.");
                                                }
                                            }
                                        } else if (typeUser == 4) {
                                            // Deletar manhwa
                                            if (manhwas.isEmpty()) {
                                                System.out.println("Não há manhwas cadastrados.");
                                            } else {
                                                System.out.println("Digite o título do manhwa a ser deletado: ");
                                                String tituloDeletar = s.nextLine();
                                                boolean encontrado = false;
                                                for (Manhwa manhwa : manhwas) {
                                                    if (manhwa.getTitulo().equalsIgnoreCase(tituloDeletar)) {
                                                        encontrado = true;
                                                        manhwas.remove(manhwa);
                                                        System.out.println("Manhwa deletado com sucesso!");
                                                        break;
                                                    }
                                                }
                                                if (!encontrado) {
                                                    System.out.println("Manhwa não encontrado.");
                                                }
                                            }
                                        } else if (typeUser == 5) {
                                            // Sair do programa
                                            System.out.println("Saindo...");
                                            break;
                                        } else {
                                            System.out.println("Opção inválida.");
                                        }
                                    }
                                    s.close();
                                }
                            }
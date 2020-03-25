package br.ufrgs.avatarfight;

/**
 * Define as funções básicas de um dobrador
 */
interface Dobrador {

    /**
     * Subtrai o valor de entrada da vida do dobrador
     * @param dano Valor a ser subtraido
     */
    void sofrerDano(float dano);

    /**
     * Pega o nome do dobrador
     * @return Nome do dobrador
     */
    String getNome();

    /**
     * Retorna se o dobrador está em estado de stun
     * @return Retorna true para jogar em estado de stun e false para o contrário
     */
    boolean getEstaEmStun();

    /**
     * Salva um novo valor para o estado de stun
     * @param estaEmStun Novo estado de stun
     */
    void setEstaEmStun(boolean estaEmStun);

    /**
     * Verifica se o dobrador está vivo
     * @return Retorna se o dobrador está vivo ou não
     */
    boolean estaVivo();

    /**
     * Retorna a chance de dar stun no ataque do dobrador
     * @return Retorna a chance de stun
     */
    float getChanceStun();

    /**
     * Calcula o dano do ataque simples do dobrador
     * @return Dano do ataque
     */
    float calcAtaqueSimples();

    /**
     * Calcula o dano do ataque médio do dobrador
     * @return Dano do ataque médio
     */
    float calcAtaqueMedio();

    /**
     * Calcula o dano do ataque máximo do dobrador
     * @return Dano do ataque máximo
     */
    float calcAtaqueMaximo();

    /**
     * Calcula a porcentagem de defesa contra um determinado elemento
     * @param dobrador Dobrador que está atacando
     * @return Porcentagem de defesa contra o elemento de entrada
     */
    float calcDefesa(Dobrador dobrador);

    /**
     * Pega o multiplicador do dano para o elemento fogo que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaFogo();

    /**
     * Pega o multiplicador do dano para o elemento ar que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAr();

    /**
     * Pega o multiplicador do dano para o elemento água que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAgua();

    /**
     * Pega o multiplicador do dano para o elemento terra que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaTerra();

}

package br.com.projeto.pontointeligente.api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	public PasswordUtils(){}
	
	public static String gerarBCrypt(String senha){
		if (senha == null){
			return senha;
		}
		
		//Gerador de hash
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}

}

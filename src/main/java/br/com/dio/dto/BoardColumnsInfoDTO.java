package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnsInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}

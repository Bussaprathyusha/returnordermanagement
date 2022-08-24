package com.returnorder.managment.componentprocessingservice.mapper;

import com.returnorder.managment.componentprocessingservice.dto.ProcessRequestDTO;
import com.returnorder.managment.componentprocessingservice.entity.ProcessRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-24T15:06:23+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ProcessRequestMapperImpl implements ProcessRequestMapper {

    @Override
    public ProcessRequestDTO processRequestEntityToProcessRequestDto(ProcessRequest processRequest) {
        if ( processRequest == null ) {
            return null;
        }

        ProcessRequestDTO processRequestDTO = new ProcessRequestDTO();

        processRequestDTO.setComponentType( processRequest.getComponentType() );
        processRequestDTO.setQuantity( processRequest.getQuantity() );

        return processRequestDTO;
    }
}

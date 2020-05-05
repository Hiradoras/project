package com.zeroone.project.services.imp;

import com.zeroone.project.entity.Tshirt;
import com.zeroone.project.repository.TshirtRepository;
import com.zeroone.project.services.TshirtService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TshirtServiceImpl implements TshirtService {
    private final TshirtRepository tshirtRepository;

    public TshirtServiceImpl(TshirtRepository tshirtRepository) {
        this.tshirtRepository = tshirtRepository;
    }

    @Override
    public List<Tshirt> findAll() {
        List<Tshirt> tshirts = tshirtRepository.findAll();
        return tshirts;
    }
}

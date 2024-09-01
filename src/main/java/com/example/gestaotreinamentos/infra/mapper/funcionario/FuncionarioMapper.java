package com.example.gestaotreinamentos.infra.mapper.funcionario;

import com.example.gestaotreinamentos.core.domain.centrocusto.CentroCusto;
import com.example.gestaotreinamentos.core.domain.funcao.Funcao;
import com.example.gestaotreinamentos.core.domain.funcionario.Funcionario;
import com.example.gestaotreinamentos.core.domain.setor.Setor;
import com.example.gestaotreinamentos.core.domain.turno.Turno;
import com.example.gestaotreinamentos.infra.entity.centroCusto.CentroCustoEntity;
import com.example.gestaotreinamentos.infra.entity.funcao.FuncaoEntity;
import com.example.gestaotreinamentos.infra.entity.funcionario.FuncionarioEntity;
import com.example.gestaotreinamentos.infra.entity.setor.SetorEntity;
import com.example.gestaotreinamentos.infra.entity.turno.TurnoEntity;
import com.example.gestaotreinamentos.infra.mapper.CentroCustoMapper;
import com.example.gestaotreinamentos.infra.mapper.funcao.FuncaoMapper;
import com.example.gestaotreinamentos.infra.mapper.setor.SetorMapper;
import com.example.gestaotreinamentos.infra.mapper.turno.TurnoMapper;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {

    private final SetorMapper setorMapper;
    private final TurnoMapper turnoMapper;
    private final CentroCustoMapper centroCustoMapper;
    private final FuncaoMapper funcaoMapper;

    public FuncionarioEntity toFuncionarioEntity(Funcionario funcionario) {
        SetorEntity setor = setorMapper.toSetorEntity(funcionario.setor());
        TurnoEntity turno = turnoMapper.toTurnoEntity(funcionario.turno());
        CentroCustoEntity centroCusto = centroCustoMapper.toCentroCustoEntity(funcionario.centroCusto());
        FuncaoEntity funcao = funcaoMapper.toFuncaoEntity(funcionario.funcao());
        return new FuncionarioEntity(
                funcionario.id(),
                funcionario.nome(),
                funcionario.re(),
                funcionario.cpfCnpj(),
                setor,
                turno,
                centroCusto,
                funcao,
                funcionario.situacao());
    }

    public FuncionarioMapper(SetorMapper setorMapper, TurnoMapper turnoMapper, CentroCustoMapper centroCustoMapper, FuncaoMapper funcaoMapper) {
        this.setorMapper = setorMapper;
        this.turnoMapper = turnoMapper;
        this.centroCustoMapper = centroCustoMapper;
        this.funcaoMapper = funcaoMapper;
    }

    public Funcionario toFuncionario(FuncionarioEntity funcionarioEntity) {
        Setor setor = setorMapper.toSetor(funcionarioEntity.getSetor());
        Turno turno = turnoMapper.toTurno(funcionarioEntity.getTurno());
        CentroCusto centroCusto = centroCustoMapper.toCentroCusto(funcionarioEntity.getCentroCusto());
        Funcao funcao = funcaoMapper.toFuncao(funcionarioEntity.getFuncao());
        return new Funcionario(funcionarioEntity.getId(), funcionarioEntity.getNome(), funcionarioEntity.getRe(), funcionarioEntity.getCpfCnpj(),
                setor, turno, centroCusto, funcao, funcionarioEntity.getSituacao());
    }
}
package com.sid.gl.decorator;

import java.math.BigDecimal;

/**
 * Classe de base pour les décorateurs, cette classe hérite de Sandwich,
 * de sorte que *elle peut être du même type, ce qui est requis pour transmettre
 * les décorateurs là où  l'objet original est attendu.
 * Plus tard, cette classe sera également utile
 * pour fournir des fonctionnalités communes aux décorateurs
 */
public abstract class SandWitchDecorator extends Sandwitch {

    @Override
    public BigDecimal price() {
        return null;
    }
}

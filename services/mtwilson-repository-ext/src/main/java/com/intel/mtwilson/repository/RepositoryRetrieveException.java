/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intel.mtwilson.repository;

/**
 *
 * @author ssbangal
 */
public class RepositoryRetrieveException extends RepositoryException {
    private Locator locator;
    
    public RepositoryRetrieveException() {
        super();
    }

    public RepositoryRetrieveException(String message) {
        super(message);
    }

    public RepositoryRetrieveException(Throwable cause) {
        super(cause);
    }

    public RepositoryRetrieveException(Throwable cause, Locator locator) {
        super(cause);
    }
    
    public RepositoryRetrieveException(String message, Throwable cause) {
        super(message, cause);
    }

    public Locator getLocator() {
        return locator;
    }
    
}

/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.web;

import org.jboss.logging.Cause;
import org.jboss.logging.Message;
import org.jboss.logging.MessageBundle;
import org.jboss.logging.Messages;

/**
 * Logging IDs 6000-6500
 * @author remm
 */
@MessageBundle(projectCode = "JBWEB")
public interface ELMessages {

    /**
     * The messages
     */
    ELMessages MESSAGES = Messages.getBundle(ELMessages.class);

    @Message(id = 6000, value = "Expected type cannot be null")
    String errorNullType();

    @Message(id = 6001, value = "ValueExpression is a literal and not writable: %s")
    String errorPropertyNotWritable(Object value);

    @Message(id = 6002, value = "Cannot convert %s of type %s to %s")
    IllegalArgumentException errorConvertingWithException(Object obj, Class<? extends Object> clazz, String type);

    @Message(id = 6003, value = "Cannot convert %s of type %s to %s")
    String errorConverting(Object obj, Class<? extends Object> clazz, Class<? extends Object> type);

    @Message(id = 6004, value = "Cannot compare %s to %s")
    String errorComparing(Object obj1, Object obj2);

    @Message(id = 6005, value = "Expression cannot be null")
    String errorNullExpression();

    @Message(id = 6006, value = "Expression cannot contain both '#{..}' and '${..}' : %s")
    String errorMixedExpression(String expression);

    @Message(id = 6007, value = "Failed to parse the expression [%s]")
    String errorParse(String expression);

    @Message(id = 6008, value = "Expression uses functions, but no FunctionMapper was provided")
    String missingFunctionMapper();

    @Message(id = 6009, value = "Function ''%s'' not found")
    String functionNotFound(String function);

    @Message(id = 6010, value = "Function ''%s'' specifies %s params, but %s were declared")
    String functionWrongParameterCount(String function, int count, int declared);

    @Message(id = 6011, value = "Parameter types cannot be null")
    String nullParameterTypes();

    @Message(id = 6012, value = "The identifier [%s] is not a valid Java identifier as required by section 1.19 of the EL specification (Identifier ::= Java language identifier). This check can be disabled by setting the system property org.apache.el.parser.SKIP_IDENTIFIER_CHECK to true.")
    String errorNotJavaIdentifier(String identifier);

    @Message(id = 6013, value = "Error calling function ''%s''")
    String errorCallingFunction(String function);

    @Message(id = 6014, value = "ELResolver cannot handle a null base Object with identifier ''%s''")
    String errorNullBaseObject(String identifier);

    @Message(id = 6015, value = "ELResolver did not handle type: %s with property of ''%s''")
    String errorResolving(Object type, Object property);

    @Message(id = 6016, value = "Target Unreachable, identifier ''%s'' resolved to null")
    String errorResolvingIdentifierType(String identifier);

    @Message(id = 6017, value = "Target Unreachable, ''%s'' returned null")
    String errorResolvingProperty(Object property);

    @Message(id = 6018, value = "Illegal Syntax for Set Operation")
    String errorWithSetSyntax();

    @Message(id = 6019, value = "Method not found: %s.%s(%s)")
    String methodNotFound(Object base, Object method, String parameters);

    @Message(id = 6020, value = "Unable to find unambiguous method: %s.%s(%s)")
    String ambiguousMethod(Object base, Object method, String parameters);

}

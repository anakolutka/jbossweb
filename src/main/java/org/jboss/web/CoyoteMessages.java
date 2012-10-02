/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.web;

import java.io.IOException;

import org.jboss.logging.Cause;
import org.jboss.logging.Message;
import org.jboss.logging.MessageBundle;
import org.jboss.logging.Messages;

/**
 * Logging IDs 2000-3000
 * @author Remy Maucherat
 */
@MessageBundle(projectCode = "JBWEB")
public interface CoyoteMessages {

    /**
     * The messages
     */
    CoyoteMessages MESSAGES = Messages.getBundle(CoyoteMessages.class);

    @Message(id = 2000, value = "Alias name %s does not identify a key entry")
    String noKeyAlias(String alias);

    @Message(id = 2001, value = "SSL configuration is invalid due to %s")
    String invalidSSLConfiguration(String message);

    @Message(id = 2002, value = "Socket bind failed: [%s] %s")
    Exception socketBindFailed(int code, String message);

    @Message(id = 2003, value = "Socket listen failed: [%s] %s")
    Exception socketListenFailed(int code, String message);

    @Message(id = 2004, value = "More than the maximum number of request parameters (GET plus POST) for a single request (%s) were detected. Any parameters beyond this limit have been ignored. To change this limit, set the maxParameterCount attribute on the Connector.")
    IllegalStateException maxParametersFail(int limit);

    @Message(id = 2005, value = "Header count exceeded allowed maximum [%s]")
    IllegalStateException maxHeadersFail(int limit);

    @Message(id = 2006, value = "Odd number of hexadecimal digits")
    IllegalStateException hexaOdd();

    @Message(id = 2007, value = "Bad hexadecimal digit")
    IllegalStateException hexaBad();

    @Message(id = 2008, value = "EOF while decoding UTF-8")
    String utf8DecodingEof();

    @Message(id = 2009, value = "UTF-8 decoding failure, byte sequence [%s, %s, %s, %s]")
    String utf8DecodingFailure(int b0, int b1, int b2, int b3);

    @Message(id = 2010, value = "UTF-8 decoding failure, byte sequence [%s, %s, %s]")
    String utf8DecodingFailure(int b0, int b1, int b2);

    @Message(id = 2011, value = "Socket read failed")
    String failedRead();

    @Message(id = 2012, value = "Socket write failed")
    String failedWrite();

    @Message(id = 2013, value = "Invalid message received")
    String invalidAjpMessage();

    @Message(id = 2014, value = "Unexpected EOF read on the socket")
    String eofError();

    @Message(id = 2015, value = "Request header is too large")
    IllegalArgumentException requestHeaderTooLarge();

    @Message(id = 2016, value = "Backlog is present")
    String invalidBacklog();

    @Message(id = 2017, value = "Invalid CRLF, no CR character encountered")
    IOException invalidCrlfNoCr();

    @Message(id = 2018, value = "Invalid CRLF, two CR characters encountered")
    IOException invalidCrlfTwoCr();

    @Message(id = 2019, value = "Invalid CRLF")
    IOException invalidCrlf();

    @Message(id = 2020, value = "Invalid chunk header")
    IOException invalidChunkHeader();

    @Message(id = 2021, value = "Channel pattern must not be null")
    NullPointerException invalidNullChannelPattern();

    @Message(id = 2022, value = "Invalid message class, you can only publish messages created through the Bayeux.newMessage() method")
    IllegalArgumentException invalidMessagePublish();

    @Message(id = 2023, value = "Misconfigured server, must be configured to support Comet operations")
    String invalidBayeuxConfiguration();

    @Message(id = 2024, value = "No Bayeux message to send")
    String noBayeuxMessage();

    @Message(id = 2025, value = "Client doesn't support any appropriate connection type")
    String noBayeuxConnectionType();

    @Message(id = 2026, value = "Unable to fit %s bytes into the array. length:%s required length: %s")
    ArrayIndexOutOfBoundsException errorGeneratingUuid(int uuidLength, int destLength, int reqLength);

    @Message(id = 2027, value = "Invalid client id")
    String invalidBayeuxClientId();

    @Message(id = 2028, value = "Invalid handshake")
    String invalidBayeuxHandshake();

    @Message(id = 2029, value = "No Bayeux subscription")
    String noBayeuxSubscription();

    @Message(id = 2030, value = "Message data missing")
    String noBayeuxMessageData();

    @Message(id = 2031, value = "Invalid JSON object in data attribute")
    String invalidBayeuxMessageData();

    @Message(id = 2032, value = "Unsupported APR Version %s")
    UnsatisfiedLinkError unsupportedAprVersion(String version);

    @Message(id = 2033, value = "Missing APR threads support")
    UnsatisfiedLinkError missingAprThreadsSupport();

    @Message(id = 2034, value = "(Error on: ")
    String aprError();

    @Message(id = 2035, value = "Buffer length %s overflow with limit %s and no sink")
    String bufferOverflow(int length, int limit);

    @Message(id = 2036, value = "Unexpected EOF")
    String unexpectedEof();

    @Message(id = 2037, value = "Invalid HEX")
    String invalidHex();

    @Message(id = 2038, value = "Invalid slash")
    String invalidSlash();

    @Message(id = 2039, value = "Control character in cookie value or attribute")
    IllegalArgumentException invalidControlCharacter();

    @Message(id = 2040, value = "Invalid escape character in cookie value")
    IllegalArgumentException invalidEscapeCharacter();

}